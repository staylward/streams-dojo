package com.staylward.stream.dojo.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExampleFindFirst {

    public static Optional<Book> findFirstSpecialBook(List<Book> books) {
        List<Book> booksWithSpecialCharacters = new ArrayList<>();
        for (Book book : books) {
            if (book.hasSpecialCharacter()) {
                booksWithSpecialCharacters.add(book);
            }
        }
        if (booksWithSpecialCharacters.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(booksWithSpecialCharacters.get(0));
        }
    }
}
