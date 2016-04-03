package com.growingwiththeweb.sorting;

public class GnomeSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        int i = 0;
        while (i < array.length) {
            if (i == 0 || array[i - 1].compareTo(array[i]) <= 0) {
                i++;
            } else {
                swap(array, i, i - 1);
                i--;
            }
        }
    }

    private static <T extends Comparable<T>> void swap(
            T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
