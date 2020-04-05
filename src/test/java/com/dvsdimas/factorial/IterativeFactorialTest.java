package com.dvsdimas.factorial;

/**
 * Created by dmylnev on 31.03.18.
 */

public class IterativeFactorialTest extends AbstractFactorialTest {

    @Override
    IFactorialCalculator getFactorialCalculator() {
        return IterativeFactorial.INSTANCE;
    }

}
