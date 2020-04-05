package com.dvsdimas.utils;

/**
 * Created by dmylnev on 25.03.18.
 */

public final class ArrayUtils {

    private ArrayUtils(){}

    public static void swap(final int[] array, final int i, final int j) {

        if(i == j) return;

        final int tmp = array[i];

        array[i] = array[j];

        array[j] = tmp;
    }

    public static boolean isSorted(final int[] array) {

        for (int i = 0; i <= array.length - 2; i++) {
            if(array[i] > array[i + 1]) return false;
        }

        return true;
    }

}
