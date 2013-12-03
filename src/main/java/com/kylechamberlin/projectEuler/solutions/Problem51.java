package projectEuler;

import java.util.BitSet;


public class Problem51 {

	int answer = 0;
	int primeIndex = 1;
	int prime;
	int limit = 100000000;
	BitSet primeList;

	public Problem51(){
		primeSieve(limit);
		while(true){
			nextPrime();
			int temp = numberInFamily(prime);
			if(temp==8){
				answer=prime;
				break;
			}
		}
	}
		
	public int getAnswer(){
		return answer;
	}
	
	private void primeSieve(int mLimit) 
	{ 
	    primeList = new BitSet(mLimit>>1); 
	    primeList.set(0,primeList.size(),true); 

	    int sqroot = (int) Math.sqrt(mLimit); 
	    primeList.clear(0); 
	    for(int num = 3; num <= sqroot; num+=2) 
	    { 
	        if( primeList.get(num >> 1) ) 
	        { 
	            int inc = num << 1;
	            for(int factor = num * num; factor < mLimit; factor += inc) 
	            { 
	                    primeList.clear(factor >> 1); 
	            } 
	        } 
	    } 
	} 
	
	private void nextPrime() {
		primeIndex++;
		primeIndex = primeList.nextSetBit(primeIndex);
		prime = primeIndex*2 +1;
	}

	public boolean isPrime(int num) 
	{ 
	    if( num < limit)
	    {
	        if( (num & 1) == 0) 
	            return ( num == 2); 
	        else 
	            return primeList.get(num>>1);
	    }
	    return false;
	}
	
	private int numberInFamily(int pN){
		int maxCount = 0;
		int count = 0;
		for(int p1 = 10; p1 < pN; p1*=10){
			int digit1 = (pN%(p1*10)-pN%(p1)) / p1;
			for(int p2 = 10;digit1 < 3 && p2 < p1; p2*=10){
				int digit2 = (pN%(p2*10)-pN%(p2)) / p2;
				for(int p3 = 10; digit1 == digit2 && p3 < p2; p3*=10){
					int digit3 = (pN%(p3*10)-pN%(p3)) / p3;
					count = 0;				
					for(int num = 1; digit1 == digit3 && num + digit1 < 10 ;num++){
						int numToAdd = (num*p1) + ((num)*p2) + (num*p3);
						int check = pN+numToAdd;
						if(isPrime(check)){
							count++;
						}
					}
					if(count > maxCount){
						maxCount = count;
					}
				}
			}
		}
		return maxCount + 1;
	}
}
