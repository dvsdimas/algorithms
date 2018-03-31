package com.dvsdimas.app.factorial;

/**
 * Created by dmylnev on 31.03.18.
 */

public class RecursiveFactorialTest extends AbstractFactorialTest {

    @Override
    IFactorialCalculator getFactorialCalculator() {
        return RecursiveFactorial.INSTANCE;
    }

}
