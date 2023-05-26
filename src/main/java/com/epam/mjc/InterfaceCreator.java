package com.epam.mjc;

import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return integers -> integers.stream().map(a -> a / 3).collect(Collectors.toList());
    }
}
