package com.staylward.stream.dojo.eight;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Book {
    private String title;
    private Integer pageCount;

    public boolean hasSpecialCharacter() {
        return !title.matches("\\A\\p{ASCII}*\\z");
    }
}
