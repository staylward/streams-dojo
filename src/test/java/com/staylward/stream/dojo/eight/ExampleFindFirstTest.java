package com.staylward.stream.dojo.eight;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleFindFirstTest {
    @Test
    public void shouldReturnBookThatContainsSpecialCharacters() {
        // Given
        List<Book> normalBooks = asList(
                new Book("Test", 10),
                new Book("Lord of the rings", 15),
                new Book("Dune", 20)
        );
        List<Book> specialBooks = asList(
                new Book("Tést", 25),
                new Book("The hitchhiker's guide to the galaxy", 30),
                new Book("\uD83D\uDC4C", 35)
        );

        List<Book> allBooks = new ArrayList<>();
        allBooks.addAll(normalBooks);
        allBooks.addAll(specialBooks);

        // When
        Optional<Book> result = ExampleFindFirst.findFirstSpecialBook(allBooks);

        // Then
        assertThat(result.isPresent()).isTrue();
        Book value = result.orElse(null);
        assertThat(specialBooks).contains(value);
    }
}