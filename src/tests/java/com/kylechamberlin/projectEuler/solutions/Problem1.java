/**Problem 1 from projectEuler.net 
 * Posted 05 October 2001
 * Solution by Kyle Chamberlin
 * Solved 12 July 2012
 * Problem 1 is stated as :
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

package projectEuler;

public class Problem1 {

	int answer = 0;
	/**
	 * 
	 * @param args
	 */
	 
	public Problem1(){
		for(int i=1;i<1000;i++){
			if(i%3==0 || i%5==0){
				answer += i;
			}
		}
	}
	
	public int getAnswer(){
		return answer;
	}
	
	

}
