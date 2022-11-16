package com.petrenko.service;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {
    final private Random random = new Random();

    public int[] createRandomArray(final int lengthOfArray) {
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = random.nextInt(201) - 100;
        }
        return array;
    }
    public int[] sortArray(final int[] array, final boolean sort) {
        if (sort) {
            return ascendingSort(array);
        } else {
            return descendingSort(array);
        }
    }
    private int[] ascendingSort(final int[] array) {
        int[] sortArray = Arrays.stream(array).toArray();
        int change;
        int count = 0;
        do {
            change = 0;
            for (int i = 0; i < sortArray.length - 1 - count; i++) {
                if (sortArray[i] >= sortArray[i + 1]) {
                    int temp = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = temp;
                    change++;
                }
            }
            count++;
        } while (change > 0);
        return sortArray;
    }
    private int[] descendingSort(final int[] array) { //Do you want to ascending sort array
        int[] sortArray = Arrays.stream(array).toArray();
        int change;
        int count = 0;
        do {
            change = 0;
            for (int i = sortArray.length - 1; i > count; i--) {
                if (sortArray[i - 1] <= sortArray[i]) {
                    int temp = sortArray[i];
                    sortArray[i] = sortArray[i - 1];
                    sortArray[i - 1] = temp;
                    change++;
                }
            }
            count++;
        } while (change > 0);
        return sortArray;
    }
    public int[] toCube(final int[] array) {
        int[] cubeArray = Arrays.stream(array).toArray();
        for (int i = 2; i < cubeArray.length; i += 3) {
            cubeArray[i] = (int) Math.pow(cubeArray[i], 3);
        }
        return cubeArray;
    }
}
