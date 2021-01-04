package simplest.possible.implementation;

import java.util.*;

public class PrimeFactors {
    public List<Integer> factors = new ArrayList<Integer>();

    public List<Integer> of(int number) {
        if(number == 1)
            return factors;
        else
            if(isPrime(number)){
                factors.add(number);
            }
        return factors;
    }

    private boolean isPrime(int number) {
        for(int divisor = 2; divisor < number/2; divisor++)
            if(number%divisor == 0)
                return false;
        return true;
    }
}
