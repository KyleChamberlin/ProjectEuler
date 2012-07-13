package projectEuler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;

public class Problem51 {

	long answer = 0;
	long prime = 2;
	Set<Long> primes = new HashSet<Long>();
	NavigableSet<Long> primes1 = new NavigableSet<Long>();
	/**
	 * 
	 * @param args
	 */
	public Problem51(){
		while (prime < 10000){
			nextPrime();
		}
		int most = 0;
		while(most < 8){
			nextUnCheckedPrime();
			
			int nif = numberInFamily(prime);
			if(nif > most){
				most = nif;
			}

		}
		answer=prime;
		
		
		
	}
		
	public long getAnswer(){
		return answer;
	}
	
	private void nextPrime() {
		primes.add(prime);
		primes1.add(prime);
		prime++;
		while(!isPrime(prime)){
			prime++;
		}
		
	}
	
	private void nextUnCheckedPrime() {
		primes.add(prime);
		primes1.add(prime);
		prime++;
		while(!primes.contains(prime) && !isPrime(prime)){
			prime++;
		}
		
	}
	
	private boolean isPrime(long pN){
		boolean check = true;
		for (int i = 0; (primes1.get(i) <= Math.sqrt(pN)) ; i++) {
			if (pN % primes1.get(i) == 0){
				check = false;
				break;
			}
		}

		return check;
	}
	
	private int numberInFamily(long pN){
		int maxCount = 0;
		int count = 0;
		for(long p1 = 10; p1 < pN; p1*=10){
			long digit1 = (pN%(p1*10)-pN%(p1)) / p1;
			for(long p2 = 10;p2 < p1; p2*=10){
				count = 0;
				
				long digit2 = (pN%(p2*10)-pN%(p2)) / p2;
				long start = (digit1>digit2 ? digit1 : digit2);
				for(long num = 0; digit1 == digit2 && digit2 < 3L && num + start < 10 ;num++){
					long numToAdd = (num*p1) + ((num)*p2);
					long check = pN+numToAdd;
					if(check != pN && isPrime(check)){
						System.out.print(""+ check + " ");
						primes.add(pN+num);
						count++;
						if(count > maxCount){
							maxCount = count;
						}
					}
				}
				System.out.println(" -> "+(count +1));
			}
		}
		return maxCount + 1;
	}
	
}
