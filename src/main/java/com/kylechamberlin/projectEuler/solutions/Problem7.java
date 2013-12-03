package projectEuler;

import java.util.ArrayList;
import java.util.List;



public class Problem7 {

	long answer = 0;
	long prime = 2;
	List<Long> primes = new ArrayList<Long>();
	/**
	 * 
	 * @param args
	 */
	public Problem7(){
		primes.add(prime);
		for(long i = 1; i<=10001;nextPrime()){
			answer = prime;
			i++;
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
		for (int i = 0; primes.get(i) <= n/2; i++) {
			if(i > Math.sqrt(n)){
				break;
			}
			while (n % primes.get(i) == 0) {
				n /= primes.get(i);
				break;
			}
		}
		if(pNumber == n){
			check = true;
		}
	
		return check;
	}

}
