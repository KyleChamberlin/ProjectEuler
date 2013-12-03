package projectEuler;

import java.math.BigInteger;

public class Problem53 {
	
	int answer = 0;
	BigInteger check = new BigInteger("1000000");
	Factorial factorials = new Factorial(100);
	
	public Problem53(){
		int count = 0;
		for(int n = 3;n <= 100 ; n++){
			for (int r = 2; r < n; r++){
				BigInteger val = nCr(n,r);
				if(val.compareTo(check) > 0){
					count ++;
				}
			}
		}	
		answer = count;
	}
	
	private BigInteger nCr(int pN, int pR){
		BigInteger nFact = factorials.getNfact(pN);
		BigInteger rFact = factorials.getNfact(pR);
		BigInteger comb_BI = nFact.divide(rFact.multiply(factorials.getNfact((pN-pR))));
		
		return comb_BI;
	}

	public int getAnswer(){
		return answer;
	}	
}
