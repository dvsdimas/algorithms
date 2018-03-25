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

        final int[] array = new int[2];

        array[0] = 0;
        array[1] = 1;

        ArrayUtils.swap(array, 0, 1);

        assertEquals(1, array[0]);
        assertEquals(0, array[1]);
    }

}
