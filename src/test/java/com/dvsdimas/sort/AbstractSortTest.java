package com.dvsdimas.sort;

import com.dvsdimas.utils.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by dmylnev on 30.03.18.
 */

abstract class AbstractSortTest {

    abstract ISort getSorter();

    private void doSort(final int[] array) {

        getSorter().sort(array);

        assertTrue(ArrayUtils.isSorted(array));
    }

    @Test
    public void testSort1() {
        doSort(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void testSort2() {
        doSort(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1});
    }

    @Test
    public void testSort3() {
        doSort(new int[] {1, -1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void testSort4() {
        doSort(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, -5});
    }

    @Test
    public void testSort5() {
        doSort(new int[] {1, 1, 1, 1});
    }

    @Test
    public void testSort6() {
        doSort(new int[] {1});
    }

    @Test
    public void testSort7() {
        doSort(new int[] {5, 5, 5, 5, 5, 5, 6});
    }

    @Test
    public void testSort8() {
        doSort(new int[] {6, 5, 5, 5, 5, 5, 5});
    }

    @Test
    public void testSort9() {
        doSort(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 1});
    }

    @Test
    public void testSort10() {
        doSort(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 9});
    }

}
