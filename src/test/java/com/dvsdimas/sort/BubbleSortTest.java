package com.dvsdimas.sort;

/**
 * Created by dmylnev on 25.03.18.
 */

public final class BubbleSortTest extends AbstractSortTest {

    @Override
    ISort getSorter() {
        return BubbleSort.SORTER;
    }

}
