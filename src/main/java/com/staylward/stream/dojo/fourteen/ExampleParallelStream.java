package com.staylward.stream.dojo.fourteen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ExampleParallelStream {
    public static List<BigDecimal> getCalculatedPrices(List<Item> items, Integer inventoryMoreThan) throws ExecutionException, InterruptedException {
        List<BigDecimal> results = new ArrayList<>();
        List<FutureTask<BigDecimal>> tasks = new ArrayList<>();
        for (Item item : items) {
            if (item.getInventoryCount() > inventoryMoreThan) {
                tasks.add(getCalculationTask(item));
            }
        }
        for (FutureTask<BigDecimal> task : tasks) {
            createNewAsyncThread(task).start();
        }
        for (FutureTask<BigDecimal> task : tasks) {
            task.isDone();
            results.add(task.get());
        }
        return results;
    }

    private static Thread createNewAsyncThread(FutureTask<BigDecimal> task) {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                task.run();
            }
        });
    }

    private static FutureTask<BigDecimal> getCalculationTask(Item item) {
        return new FutureTask<>(() -> ComplexPriceCalculator.execute(item));
    }
}
