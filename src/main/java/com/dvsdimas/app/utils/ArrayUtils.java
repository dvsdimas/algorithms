package com.dvsdimas.app.utils;

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

}
