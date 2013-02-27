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

public class Problem411 {

	int answer = 0;
	/**
	 * 
	 * @param args
	 */
	public Problem411(){
		int sum = 0;
		for(int i=1;i<=30;i++){
			sum += S((int) Math.pow(i, 5));
		}
		answer = sum;
	}
	
	private int S(int pIn){
		boolean grid[][] = new boolean[pIn][pIn];
		for(int p = 0; p < 2*pIn; p++){
			int x =(int) Math.pow(2, p)%pIn;
			int y =(int) Math.pow(3, p)%pIn;
			grid[x][y] = true;			
		}
		
		
		int returnval = 1;
		return returnval;
	}
	
	public int getAnswer(){
		return answer;
	}
	
	private int modular(int base, int exp, int mod)
	{
	    int x = 1;
	    int power = base % mod;

	    for (int i = 0; i < sizeof(int) * 8; i++) {
	        int least_sig_bit = 0x00000001 & (exp >> i);
	        if (least_sig_bit)
	            x = (x * power) % mod;
	        power = (power * power) % mod;
	    }

	    return x;
	}
	

}
