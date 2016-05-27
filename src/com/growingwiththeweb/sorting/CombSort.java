package com.growingwiththeweb.sorting;

public class CombSort {
    public static void sort(Integer[] array) {
        int gap = array.length;
        float shrinkFactor = 1.3f;
        boolean swapped = false;

        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int)(gap / shrinkFactor);
            }

            swapped = false;

            for (int i = 0; gap + i < array.length; i++) {
                if (array[i] > array[i + gap]) {
                    swap(array, i, i + gap);
                    swapped = true;
                }
            }
        }
    }

    private static void swap(Integer[] array, int a, int b) {
        Integer temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
