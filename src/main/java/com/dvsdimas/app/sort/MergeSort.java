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

        if(array.length < 1) throw new IllegalArgumentException("array.length less than one !");
        if(begin < 0) throw new IllegalArgumentException("begin index less than zero ! [" + begin + "]");
        if(end < 0) throw new IllegalArgumentException("end index less than zero ! [" + end + "]");
        if(begin > end) throw new IllegalArgumentException("begin index more than end index ! begin[" + begin + "], end [" + end + "]");
        if(end > array.length) throw new IllegalArgumentException("end index more than length of the array ! [" + end + "]");

        if( (end - begin) == 1) return;

        final int mid = (begin + end)  / 2;

        sort(array, begin, mid);
        sort(array, mid, end);

        merge(array, begin, mid, end);
    }

    private static void merge(final int[] array, final int begin, final int mid, final int end) {

        if(array.length < 1) throw new IllegalArgumentException("array.length less than one !");
        if(begin < 0) throw new IllegalArgumentException("begin index less than zero ! [" + begin + "]");
        if(end < 0) throw new IllegalArgumentException("end index less than zero ! [" + end + "]");
        if(begin > end) throw new IllegalArgumentException("begin index more than end index ! begin[" + begin + "], end [" + end + "]");
        if(end > array.length) throw new IllegalArgumentException("end index more than length of the array ! [" + end + "]");
        if(begin > mid) throw new IllegalArgumentException("begin index more than mid index ! begin[" + begin + "], mid [" + mid + "]");
        if(mid > end) throw new IllegalArgumentException("mid index more than end index ! mid[" + mid + "], end [" + end + "]");

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
