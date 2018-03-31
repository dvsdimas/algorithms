package com.dvsdimas.app.factorial;

/**
 * Created by dmylnev on 31.03.18.
 */

public final class RecursiveFactorial implements IFactorialCalculator {

    public final static RecursiveFactorial INSTANCE = new RecursiveFactorial();

    private RecursiveFactorial(){}

    @Override
    public long getFactorial(int number) {

        if(number < 0) throw new IllegalArgumentException("Number [" + number + "] is less then zero !");
        else if( (number == 0) || (number == 1)) return 1;

        return number * getFactorial(number - 1);
    }
}
