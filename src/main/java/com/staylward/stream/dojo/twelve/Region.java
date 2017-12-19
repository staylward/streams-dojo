package com.staylward.stream.dojo.twelve;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Region {
    private String name;
    private List<Town> towns;
}
