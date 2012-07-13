package projectEuler;

public class Problem51 {

	int answer = 0;
	int primeIndex = 1;
	int prime = 2;
	int limit = 2000000001;
	int sieveBound = (limit - 1) /2;
	double crosslimit = (Math.sqrt(limit) - 1) / 2;
	boolean[] sieve = new boolean[sieveBound];

	public Problem51(){
		primeSieve();
		System.out.println("finished Sieving");
		int most = 0;
		int mine = 1;
		for (boolean prime : sieve){
			if(!prime){
				System.out.println(((mine*2) + 1));
			}
			mine++;
		}
		while(most < 8){
			nextPrime();
			int temp = numberInFamily(prime);
			if(temp > most){
				most = temp;
			}
		}
		answer=prime;
	}
		
	public int getAnswer(){
		return answer;
	}
	
	private void primeSieve(){
		for( int i = 1; i < crosslimit; i++){
			if(!sieve[i]){
				for(int j = (2*i)*(i+1); j < sieveBound; j += (2*i)+1){
					sieve[j]=true;
				}
			}
		}
	}
	
	private void nextPrime() {
		primeIndex++;
		while(sieve[primeIndex]){
			primeIndex++;
		}
		prime = primeIndex*2 +1;
		
	}

	private int numberInFamily(int pN){
		int maxCount = 0;
		int count = 0;
		for(int p1 = 10; p1 < pN; p1*=10){
			int digit1 = (pN%(p1*10)-pN%(p1)) / p1;
			for(int p2 = 10;p2 < p1; p2*=10){
				count = 0;				
				int digit2 = (pN%(p2*10)-pN%(p2)) / p2;
				int start = (digit1>digit2 ? digit1 : digit2);
				for(int num = 0; digit1 == digit2 && digit2 < 3L && num + start < 10 ;num++){
					int numToAdd = (num*p1) + ((num)*p2);
					int check = pN+numToAdd;
					if(check != pN && !sieve[(int) ((check - 1)/2)]){
						//System.out.print(""+ check + " ");
						count++;
						if(count > maxCount){
							maxCount = count;
						}
					}
				}
				//System.out.println(" -> "+count);
			}
		}
		return maxCount + 1;
	}	
}
