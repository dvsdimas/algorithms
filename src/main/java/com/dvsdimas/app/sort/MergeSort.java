package com.dvsdimas.app.sort;

/**
 * Created by dmylnev on 31.03.18.
 */

public final class MergeSort implements ISort {

    public final static MergeSort SORTER = new MergeSort();

    private MergeSort() {}

    @Override
    public void sort(final int[] array) {
        sort(array, 0, array.length);
    }

    private static void sort(final int[] array, final int begin, final int end) {

        if( (end - begin) == 1) return;

        final int mid = (begin + end)  / 2;

        sort(array, begin, mid);
        sort(array, mid, end);

        merge(array, begin, mid, end);
    }

    private static void merge(final int[] array, final int begin, final int mid, final int end) {

        if(array[mid - 1] <= array[mid]) return; // two parts are already sorted

        int i = begin;
        int j = mid;
        int tmp = 0;

        final int[] tempArray = new int[end - begin];

        while ( (i < mid) && (j < end) ) {
            tempArray[tmp++] = (array[i] <= array[j]) ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, begin + tmp, mid - i);
        System.arraycopy(tempArray, 0, array, begin, tmp);
    }

}
