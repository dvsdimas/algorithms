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

    public void testSwap() {

        final int[] array = new int[] {0, 1};

        ArrayUtils.swap(array, 0, 1);

        assertEquals(1, array[0]);
        assertEquals(0, array[1]);
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
