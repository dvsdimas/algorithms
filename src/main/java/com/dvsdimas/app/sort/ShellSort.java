package com.dvsdimas.app.sort;

/**
 * Created by dmylnev on 30.03.18.
 */

public class ShellSort implements ISort {

    public void sort(int[] array) {

        for(int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {

                final int element = array[i];
                int j = i;

                for(; (j >= gap) && (array[j - gap] > element); j -= gap) {
                    array[j] = array[j - gap];
                }

                array[j] = element;
            }
        }
    }
}
