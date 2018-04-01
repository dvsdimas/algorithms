package com.dvsdimas.app.sort;

/**
 * Created by dmylnev on 01.04.18.
 */

public final class QuickSort implements ISort {

    public final static QuickSort SORTER = new QuickSort();

    private QuickSort() {}

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length);
    }

    private static int partition(final int[] array, final int begin, final int end) {

        int pivot = array[begin];
        int i = begin;
        int j = end;

        while (i < j) {

            // right part
            while (i < j) {

                if(array[--j] < pivot) {
                    array[i] = array[j];
                    break;
                }

            }

            // left part
            while (i < j) {

                if(array[++i] > pivot) {
                    array[j] = array[i];
                    break;
                }

            }

        }

        array[j] = pivot;

       return j;

    }

    private static void quickSort(final int[] array, final int begin, final int end) {

        if( (end - begin) < 2) return;

        final int pivotIndex = partition(array, begin, end);

        quickSort(array, begin, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

}
