package projectEuler;

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
