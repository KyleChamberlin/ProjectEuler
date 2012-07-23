package projectEuler;

public class Problem27 {
	
	int answer = 0;
	Primes primes = new Primes(10000000);
	
	public Problem27(){
		int most = 0;
		for(int a = -999;a < 1000 ; a++){
			for (int b = -999; b < 1000; b++){
				int temp = checkQuad(a,b);
				if (temp > most){
					most = temp;
					answer = a * b;
				}
			}
		}
		
	}
	
	private int checkQuad(int pA, int pB){
		int n = 0;
		boolean checkB = true;
		while(checkB){
			int check = n*n + pA*n + pB;
			checkB = check>0?primes.isPrime(check):false;
			n++;
		}
		return n-1;
	}
	
	public int getAnswer(){
		return answer;
	}	
}
