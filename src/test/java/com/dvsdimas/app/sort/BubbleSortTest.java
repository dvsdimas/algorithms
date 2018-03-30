package com.dvsdimas.app.sort;

/**
 * Created by dmylnev on 25.03.18.
 */

public class BubbleSortTest extends AbstractSortTest {

    @Override
    ISort getSorter() {
        return new BubbleSort();
    }

}
