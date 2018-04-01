package com.dvsdimas.app.sort;

import com.dvsdimas.app.utils.ArrayUtils;

/**
 * Created by dmylnev on 25.03.18.
 */

public final class BubbleSort implements ISort {

    public final static BubbleSort SORTER = new BubbleSort();

    private BubbleSort() {}

    public void sort(final int[] array) {

        for(int sorted = array.length - 1; sorted > 0; sorted--) {

            for(int i = 0; i < sorted; i++) {

                if(array[i] > array[i + 1]) ArrayUtils.swap(array, i, i + 1);

            }
        }

    }
}
