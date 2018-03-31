package com.dvsdimas.app.factorial;

/**
 * Created by dmylnev on 31.03.18.
 */

public final class IterativeFactorial implements IFactorialCalculator {

    public final static IterativeFactorial INSTANCE = new IterativeFactorial();

    private IterativeFactorial(){}

    @Override
    public long getFactorial(final int number) {

        if(number < 0) throw new IllegalArgumentException("Number [" + number + "] is less then zero !");
        else if( (number == 0) || (number == 1)) return 1;

        long result = 1;

        for(int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

}
