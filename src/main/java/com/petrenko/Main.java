package com.petrenko;

import com.petrenko.model.Lock;
import com.petrenko.service.ArrayService;

import java.util.Arrays;
import java.util.Scanner;

//Усю практику потрібно реалізувати з використанням класів і методів де це необхідно.
//На 9
//1. Користувач вводить розмір масиву в консоль (i >= 10)
//2. Метод заповнює масив випадковими числами в діапазоні [-100; 100]
//3. Вивести масив на екран
//4. Користувачеві пропонується вибрати спосіб сортування за зростанням або спаданням
//5. Сортується масив відповідно до вибору (потрібно написати свій алгоритм сортування)
//6. Вивести масив на екран
//7. Кожне третє число масиву возвести в куб
//8. Вивести масив на екран

public class Main {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of array");
        final int lengthOfArray = scanner.nextInt();
        final int[] randomArray = arrayService.createRandomArray(lengthOfArray);
        System.out.println("Length: " + lengthOfArray + ". Array: " + Arrays.toString(randomArray));

        System.out.println("Do you want to ascending sort array? (true - ascending sort / false - descending sort)");
        final boolean sort = scanner.nextBoolean();
        final int[] sortedArray = arrayService.sortArray(randomArray, sort);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

        System.out.println("Every third element to cube:");
        final int[] arrayToCube = arrayService.toCube(randomArray);
        System.out.println("Array: " + Arrays.toString(arrayToCube));

        System.out.println();

//На 10 (включно завдання на 9)
//1. Створити клас Lock з конструктором, який приймає масив. Додати в нього метод
//геттер. Зробити так, щоб масив поміщений у клас неможливо було змінити

        int[] array = new int[]{1,2,3};
        Lock lock = new Lock(array);
        lock.printLockedArray();
        lock.getLockedArray()[0] = 10;
        lock.printLockedArray();
        array[0] = 10;
        lock.printLockedArray();
    }
}