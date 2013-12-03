/**Problem 3 from projectEuler.net 
 * Posted 02 November 2001
 * Solution by Kyle Chamberlin
 * Solved 12 July 2012
 * Problem 3 is stated as :
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */

package com.kylechamberlin.projectEuler.solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {

	long answer = 0;
	long numberToCheck = 600851475143L;
	/**
	 * 
	 * @param args
	 */
	public Problem3(){
		List<Long> primes = primeFactors(numberToCheck);
		for(Long l : primes){
			if (l > answer) {
				answer = l;
			}
		}
		
	}
	
	public long getAnswer(){
		return answer;
	}
	
	public static List<Long> primeFactors(long number) {
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

}
