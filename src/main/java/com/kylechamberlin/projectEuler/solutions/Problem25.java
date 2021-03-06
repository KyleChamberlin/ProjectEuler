/**Problem 2 from projectEuler.net 
 * Posted 19 October 2001
 * Solution by Kyle Chamberlin
 * Solved 12 July 2012
 * Problem 2 is stated as :
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 				1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

package com.kylechamberlin.projectEuler.solutions;

public class Problem25 {

	int answer = 0;
	int fibA = 1;
	int fibB = 1;
	int carries = 4;
	/**
	 * 
	 * @param args
	 */
	public Problem25(){
		for(int i=2; carries < 1000;i++,next()){
			answer = i;
		}	
	}
	
	public int getAnswer(){
		return answer;
	}
	
	private void next(){
		int[] nextFibs = sumDigit(fibA,fibB);
		fibA = nextFibs[0];
		fibB = nextFibs[1];
	}
	
	private int[] sumDigit(int pDigit1, int pDigit2) {
		int[] numbers = new int[2];
		int[] digitsSumed = new int[]{0,0,0,0,0};
		int[] fibHold = new int[]{pDigit2%10,((pDigit2%100-pDigit2%10) / 10),((pDigit2%1000-pDigit2%100) / 100),((pDigit2%10000-pDigit2%1000) / 1000),((pDigit2%100000-pDigit2%10000) / 10000)};
		int digitSum = pDigit1+pDigit2;

		digitsSumed[0] = digitSum%10;
		digitsSumed[1] = (digitSum%100-digitsSumed[0]) / 10;
		digitsSumed[2] = (digitSum%1000-digitsSumed[1]*10-digitsSumed[0]) / 100;
		digitsSumed[3] = (digitSum%10000-digitsSumed[2]*100-digitsSumed[1]*10-digitsSumed[0]) / 1000;
		digitsSumed[4] = (digitSum%100000-digitsSumed[3]*1000-digitsSumed[2]*100-digitsSumed[1]*10-digitsSumed[0]) / 10000;
		
		if(digitsSumed[4] > 0){
			numbers[0]= fibHold[4]*1000 + fibHold[3]*100 + fibHold[2]*10 + fibHold[1];
			numbers[1]= digitsSumed[4]*1000+digitsSumed[3]*100+digitsSumed[2]*10 + digitsSumed[1];
			carries++;
		} else {
			numbers[0]= pDigit2;
			numbers[1]= digitsSumed[3]*1000 +digitsSumed[2]*100 + digitsSumed[1]*10 + digitsSumed[0];
		}
		
		return numbers;
	}

}
