package com.dvsdimas.app.sort;

import com.dvsdimas.app.utils.ArrayUtils;

/**
 * Created by dmylnev on 26.03.18.
 */

public class Selection implements ISort {

    public void sort(int[] array) {

        for(int sorted = array.length - 1; sorted > 0; sorted--) {

            int max = 0;

            for(int i = 1; i <= sorted; i++) {
                if(array[max] < array[i]) max = i;
            }

            ArrayUtils.swap(array, max, sorted);
        }

    }
}
