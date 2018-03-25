package com.dvsdimas.app.sort;

import com.dvsdimas.app.utils.ArrayUtils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by dmylnev on 25.03.18.
 */

public class BubbleTest extends TestCase {

    public BubbleTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(BubbleTest.class);
    }

    public void testSort1() {

        final int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        final ISort sorter = new Bubble();

        sorter.sort(array);

        assertTrue(ArrayUtils.isSorted(array));
    }

    public void testSort2() {

        final int[] array = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};

        final ISort sorter = new Bubble();

        sorter.sort(array);

        assertTrue(ArrayUtils.isSorted(array));
    }

    public void testSort3() {

        final int[] array = new int[] {1, -1, 2, 3, 4, 5, 6, 7, 8, 9};

        final ISort sorter = new Bubble();

        sorter.sort(array);

        assertTrue(ArrayUtils.isSorted(array));
    }

    public void testSort4() {

        final int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, -5};

        final ISort sorter = new Bubble();

        sorter.sort(array);

        assertTrue(ArrayUtils.isSorted(array));
    }

    public void testSort5() {

        final int[] array = new int[] {1, 1, 1, 1};

        final ISort sorter = new Bubble();

        sorter.sort(array);

        assertTrue(ArrayUtils.isSorted(array));
    }

}
