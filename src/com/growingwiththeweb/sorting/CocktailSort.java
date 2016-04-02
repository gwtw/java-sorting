package com.growingwiththeweb.sorting;

public class CocktailSort {
    public static void sort(Integer[] array) {
        int start = -1;
        int end = array.length - 2;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = ++start; i <= end; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;
            for (int i = --end; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private static void swap(Integer[] array, int a, int b) {
        Integer temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
