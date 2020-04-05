package com.dvsdimas.sort;

/**
 * Created by dmylnev on 30.03.18.
 */

public final class InsertionSortTest extends AbstractSortTest {

    @Override
    ISort getSorter() {
        return InsertionSort.SORTER;
    }
}
