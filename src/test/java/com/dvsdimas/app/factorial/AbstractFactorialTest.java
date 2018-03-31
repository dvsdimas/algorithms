package com.dvsdimas.app.factorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmylnev on 31.03.18.
 */

public abstract class AbstractFactorialTest {

    abstract IFactorialCalculator getFactorialCalculator();

    @Test
    public void test1() {
        assertEquals(120, getFactorialCalculator().getFactorial(5));
    }

    @Test
    public void test2() {
        assertEquals(1, getFactorialCalculator().getFactorial(0));
    }

    @Test
    public void test3() {
        assertEquals(1, getFactorialCalculator().getFactorial(1));
    }

    @Test
    public void test4() {
        assertEquals(3628800, getFactorialCalculator().getFactorial(10));
    }
}
