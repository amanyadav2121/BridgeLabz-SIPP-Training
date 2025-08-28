package com.pranav.streams;

import java.util.List;

public class TransformingNames {
    // Uppercase + alphabetical sort
    public static List<String> transformAndSort(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted()
                .toList();
    }
}
