package com.dvsdimas.app.sort;

/**
 * Created by dmylnev on 31.03.18.
 */

public final class MergeSortTest extends AbstractSortTest {

    @Override
    ISort getSorter() {
        return MergeSort.SORTER;
    }

}
