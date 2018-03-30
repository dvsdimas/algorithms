package com.dvsdimas.app.sort;

/**
 * Created by dmylnev on 30.03.18.
 */

public class InsertionSort implements ISort {

    public void sort(int[] array) {

        for(int unsorted = 1; unsorted < array.length; unsorted++) {

            int forInsert = array[unsorted];

            int i;

            for(i = unsorted; (i > 0) && (array[i - 1] > forInsert) ;i--) {
                array[i] = array[i - 1];
            }

            array[i] = forInsert;
        }

    }

}
