package com.dvsdimas.app.sort;

/**
 * Created by dmylnev on 01.04.18.
 */

public class QuickSortTest extends AbstractSortTest {

    @Override
    ISort getSorter() {
        return QuickSort.SORTER;
    }

}
