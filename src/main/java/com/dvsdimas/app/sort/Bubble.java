package com.dvsdimas.app.sort;

import com.dvsdimas.app.utils.ArrayUtils;

/**
 * Created by dmylnev on 25.03.18.
 */

public class Bubble implements ISort {

    public void sort(int[] array) {

        for(int sorted = array.length - 1; sorted > 0; sorted--) {

            for(int i = 0; i < sorted; i++) {

                if(array[i] > array[i + 1]) ArrayUtils.swap(array, i, i + 1);

            }
        }

    }
}
