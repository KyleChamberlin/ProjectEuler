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
				System.out.println("n=" + n + ", r=" + r +"\nnCr="+ val);
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
		BigInteger nMinusRFact = factorials.getNfact((pN-pR));
		BigInteger denom = rFact.multiply(nMinusRFact);
		BigInteger comb_BI = nFact.divide(denom);
		
		return comb_BI;
	}

	public int getAnswer(){
		return answer;
	}	
}
