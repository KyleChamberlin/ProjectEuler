package com.kylechamberlin.projectEuler.solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem3 extends Solution{

	long answer = 0;
	long numberToCheck = 600851475143L;
    List<Long> primeFactors;

	public List<Long> primeFactors(long number) {
        List<Long> primeFactors = new ArrayList<Long>();
		for (long factor = 2; factor <= number; factor++) {
            if (areMultiples(factor, number)) {
                primeFactors.add(factor);
                number = reduceByFactor(factor, number);
            }
        }
		return primeFactors;
	}

    private boolean areMultiples(long possibleFactor, long number) {
        return number % possibleFactor == 0;
    }

    private long reduceByFactor(long possibleFactor, long number) {
        while (number % possibleFactor == 0) {
           number /= possibleFactor;
        }
        return number;
    }


    @Override
    public void solve() {
        primeFactors = primeFactors(numberToCheck);
        answer = primeFactors.get(primeFactors.size() - 1);
    }
}
