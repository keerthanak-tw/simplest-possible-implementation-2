package simplest.possible.implementation;

import java.util.*;

public class PrimeFactors {
    public List<Integer> factors = new ArrayList<Integer>();

    public List<Integer> of(int number) {
        if(number == 1)
            return factors;
        else
            factors.add(number);
        return factors;
    }
}
