package com.kylechamberlin.projectEuler.solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem3 extends Solution{

	long answer = 0;
	long numberToCheck = 600851475143L;
    List<Long> primes = primeFactors(numberToCheck);

	public List<Long> primeFactors(long number) {
		long n = number; 
		List<Long> factors = new ArrayList<Long>();
		for (long i = 2; i <= n; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		return factors;
	}

    @Override
    public void solve() {
        for(Long l : primes){
            if (l > answer) {
                answer = l;
            }
        }
    }
}
