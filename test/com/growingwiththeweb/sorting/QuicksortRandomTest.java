package com.growingwiththeweb.sorting;

public class QuicksortRandomTest extends BaseSortTest {
    protected void sort(Integer[] array) {
        Quicksort.randomSort(array);
    }
}
