package com.dvsdimas.sort;

/**
 * Created by dmylnev on 30.03.18.
 */

public final class ShellSortTest extends AbstractSortTest {

    @Override
    ISort getSorter() {
        return ShellSort.SORTER;
    }
}
