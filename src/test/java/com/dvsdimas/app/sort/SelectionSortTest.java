package com.dvsdimas.app.sort;

/**
 * Created by dmylnev on 26.03.18.
 */

public class SelectionSortTest extends AbstractSortTest {

    @Override
    ISort getSorter() {
        return new SelectionSort();
    }

}