package com.petrenko.model;

import java.util.Arrays;

public class Lock {
    private final int[] lockedArray;

    public Lock(final int[] lockedArray) {
        this.lockedArray = Arrays.stream(lockedArray).toArray();
    }
    public void printLockedArray() {
        System.out.println("Locked Array: " + Arrays.toString(lockedArray));
    }

    public int[] getLockedArray() {
        return Arrays.stream(lockedArray).toArray();
    }
}

