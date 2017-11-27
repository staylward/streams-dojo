package com.staylward.stream.dojo.eight;

import java.util.List;
import java.util.Optional;

public class ExampleFindFirst {

    public static Optional<Book> findFirstSpecialBook(List<Book> books) {
        return books.stream().filter(Book::hasSpecialCharacter).findFirst();
    }
}
