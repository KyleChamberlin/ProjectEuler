package projectEuler;

import java.math.BigInteger;

public class Problem16 {

	int answer = 0;
	/**
	 * 
	 * @param args
	 */
	public Problem16(){
		BigInteger num = new BigInteger("2");
		
		for(int i=1;i<1000;i++){
			num = num.multiply(new BigInteger("2"));
		}
		
		String digits = num.toString();
		answer = sumDigits(digits);		
	}
	
	public int getAnswer(){
		return answer;
	}
	
	private int sumDigits(String pDigits){
		int sum = 0;
		
		for(int i = 0 ; i < pDigits.length(); i++){
			sum += pDigits.charAt(i);
		}
		
		return sum;
	}
}
