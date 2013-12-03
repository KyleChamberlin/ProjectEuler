package com.kylechamberlin.projectEuler.solutions;

public class Problem12 {

	long answer = 0;
	/**
	 * 
	 * @param args
	 */
	public Problem12(){
		for(int i = 0;i <= 30000; i++){
			answer += i;
			if(factors(answer)>500){
				break;
			}			
		}
	}
		
	public long getAnswer(){
		return answer;
	}
	
	private int factors(long n) {
		int facts = 0;
		for (long j = 1; j <= Math.sqrt((double) n);j++) {
			if(n % j == 0) {
				facts++;
			}
		}
		return facts *2;
	}
}
