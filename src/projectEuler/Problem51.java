package projectEuler;

import java.util.BitSet;


public class Problem51 {

	int answer = 0;
	int primeIndex = 1;
	int prime = 2;
	int limit = 100000000;
	int listLimit = 0;
	int sieveBound = (limit - 1) /2;
	double crosslimit = (Math.sqrt(limit) - 1) / 2;
	BitSet primeList;

	public Problem51(){
		primeSieve(limit);
		System.out.println("finished Sieving");
		int most = 0;
		int howmanytimes = 1;
		int max = primeList.cardinality();
		while(most < 8 && howmanytimes < max){
			nextPrime();
			int temp = numberInFamily(prime);
			if(temp > most){
				most = temp;
				answer=prime;
			}
			howmanytimes++;
		}
		//answer=prime;
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
	                //if( ((factor) & 1) == 1) 
	                //{ 
	                    primeList.clear(factor >> 1); 
	                //} 
	            } 
	        } 
	    } 
	    listLimit = primeList.size();
	} 
	
	private void nextPrime() {
		primeIndex++;
		primeIndex = primeList.nextSetBit(primeIndex);
		prime = primeIndex*2 +1;
		
		//System.out.println(prime);
		
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
	
	private int numberInFamily2(int pN){
		int maxCount = 0;
		int count = 0;
		for(int p1 = 10; p1 < pN; p1*=10){
			int digit1 = (pN%(p1*10)-pN%(p1)) / p1;
			for(int p2 = 10;p2 < p1; p2*=10){
				count = 0;				
				int digit2 = (pN%(p2*10)-pN%(p2)) / p2;
				int start = (digit1>digit2 ? digit1 : digit2);
				int[] arrayOfChecks = new int[]{0,0,0,0,0,0,0,0,0,0};
				for(int num = 0; digit1 == digit2 && digit2 < 3L && num + start < 10 ;num++){
					int numToAdd = (num*p1) + ((num)*p2);
					int check = pN+numToAdd;
					arrayOfChecks[num] = check;
					if(check != pN && isPrime(check)){
						//System.out.print(""+ check + " ");
						count++;
					}
				}
				if(count > maxCount){
					maxCount = count;
					if(maxCount > 5){
						System.out.println("" + pN + " count: " + count);
					}
					//System.out.println(arrayOfChecks.toString());
				}
				//System.out.println(" -> "+count);
			}
		}
		return maxCount + 1;
	}	
	private int numberInFamily3(int pN){
		int maxCount = 0;
		int count = 0;
		for(int p1 = 10; p1 < pN; p1*=10){
			int digit1 = (pN%(p1*10)-pN%(p1)) / p1;
			for(int p2 = 10;p2 < p1; p2*=10){
				int digit2 = (pN%(p2*10)-pN%(p2)) / p2;
				for(int p3 = 10; p3 < p2; p3*=10){
					int digit3 = (pN%(p3*10)-pN%(p3)) / p3;
					count = 0;				
					int start = digit1;
					int[] arrayOfChecks = new int[]{0,0,0,0,0,0,0,0,0,0};
					for(int num = 0; digit1 == digit2 && digit1 == digit3 && digit2 < 3L && num + start < 10 ;num++){
						int numToAdd = (num*p1) + ((num)*p2) + (num*p3);
						int check = pN+numToAdd;
						arrayOfChecks[num] = check;
						if(check != pN && isPrime(check)){
							//System.out.print(""+ check + " ");
							count++;
						}
					}
					if(count > maxCount){
						maxCount = count;
						if(maxCount > 5){
							System.out.println("" + pN + " count: " + count);
						}
						//System.out.println(arrayOfChecks.toString());
					}
				}
				//System.out.println(" -> "+count);
			}
		}
		return maxCount + 1;
	}
}
