package com.dvsdimas.app.utils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by dmylnev on 25.03.18.
 */

public class ArrayUtilsTest extends TestCase {

    public ArrayUtilsTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(ArrayUtilsTest.class);
    }

    public void testSwap1() {

        final int[] array = new int[] {0, 1};

        ArrayUtils.swap(array, 0, 1);

        assertEquals(1, array[0]);
        assertEquals(0, array[1]);
    }

    public void testSwap2() {

        final int[] array = new int[] {0, 1};

        ArrayUtils.swap(array, 1, 1);

        assertEquals(0, array[0]);
        assertEquals(1, array[1]);
    }

    public void testSwap3() {

        final int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayUtils.swap(array, 2, 7);

        assertEquals(0, array[0]);
        assertEquals(1, array[1]);
        assertEquals(7, array[2]);
        assertEquals(3, array[3]);
        assertEquals(4, array[4]);
        assertEquals(5, array[5]);
        assertEquals(6, array[6]);
        assertEquals(2, array[7]);
        assertEquals(8, array[8]);
        assertEquals(9, array[9]);
    }

    public void testIsSorted1() {

        final int[] array = new int[] {0};

        assertTrue(ArrayUtils.isSorted(array));
    }

    public void testIsSorted2() {

        final int[] array = new int[] {0, 1};

        assertTrue(ArrayUtils.isSorted(array));
    }

    public void testIsSorted3() {

        final int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertTrue(ArrayUtils.isSorted(array));
    }

    public void testIsSorted4() {

        final int[] array = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        assertTrue(ArrayUtils.isSorted(array));
    }

    public void testNotSorted1() {

        final int[] array = new int[] {1, 0};

        assertFalse(ArrayUtils.isSorted(array));
    }

    public void testNotSorted2() {

        final int[] array = new int[] {0, -1, 1};

        assertFalse(ArrayUtils.isSorted(array));
    }

    public void testNotSorted3() {

        final int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 7};

        assertFalse(ArrayUtils.isSorted(array));
    }

}
