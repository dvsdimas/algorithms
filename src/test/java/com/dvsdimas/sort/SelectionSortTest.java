package com.dvsdimas.sort;

/**
 * Created by dmylnev on 26.03.18.
 */

public final class SelectionSortTest extends AbstractSortTest {

    @Override
    ISort getSorter() {
        return SelectionSort.SORTER;
    }

}
