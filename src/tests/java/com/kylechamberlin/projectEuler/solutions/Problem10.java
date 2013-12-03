package projectEuler;

import java.util.ArrayList;
import java.util.List;



public class Problem10 {

	long answer = 0;
	long prime = 2;

	List<Long> primes = new ArrayList<Long>();
	/**
	 * 
	 * @param args
	 */
	public Problem10(){
		primes.add(prime);
		while(prime<2000000){
			answer += prime;
			nextPrime();
		}
	}
		
	public long getAnswer(){
		return answer;
	}
	
	private void nextPrime() {
		primes.add(prime);
		prime++;
		while(!isPrime(prime)){
			prime++;
		}
	}
	
	private boolean isPrime(long pNumber){
		boolean check = false;
		long n = pNumber;
		for(long i : primes ){
			if(i > Math.sqrt(n)){
				break;
			}
			while (n%i == 0) {
				n /= i;
				break;
			}
		}
		if(pNumber == n){
			check = true;
		}
		return check;
	}
}
