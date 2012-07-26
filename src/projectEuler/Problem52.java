package projectEuler;

import java.math.BigInteger;

public class Problem52 {
	
	int answer = 0;
	BigInteger check = new BigInteger("1000000");
	Factorial factorials = new Factorial(100);
	
	public Problem52(){
		
	}
	
	private boolean check(long pN){
		boolean val = false;
		
		
		
		return val;
	}
	
	public int[] bigPower(long pA, long pB){
		int[] number = new int[(int) Math.ceil(Math.log10(pN)*pn) + 1];
		java.util.Arrays.fill(number,0);		
		number[0]=pN;
		for(int n = 1; n < pn; n++){
			for(int i = 0; i < number.length; i++){
				number[i] = number[i]*2;
			}
			for(int j=0;j<number.length;j++){
				if(number[j]>=10){
					number[j+1]+=(number[j]/10);
					number[j]=number[j]%10;					
				}
			}
		}
		return number;
	}

	public int getAnswer(){
		return answer;
	}	
}
