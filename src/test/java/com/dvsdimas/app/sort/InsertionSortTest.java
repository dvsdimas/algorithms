package com.dvsdimas.app.sort;

/**
 * Created by dmylnev on 30.03.18.
 */

public class InsertionSortTest extends AbstractSortTest {

    @Override
    ISort getSorter() {
        return new InsertionSort();
    }
}