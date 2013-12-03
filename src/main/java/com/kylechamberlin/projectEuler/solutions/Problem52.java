/**
 * It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
 *
 * Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
 */

package com.kylechamberlin.projectEuler.solutions;

import java.util.Arrays;

public class Problem52 {
	
	int answer = 0;
	
	public Problem52(){
		boolean found = false;
		int n = 10000;
		while(!found) {
			if ((n < 20000 && n >= 10000) || (n < 200000 && n >= 100000) || (n < 2000000 && n >= 1000000) || (n < 20000000 && n >= 10000000)) {
				found = check(++n);
				
			} else {
				if (n > 20000000) found = true;
				n *= 5;
			}
		}
		answer = n;
	}
	
	private boolean check(int pN){
		boolean val = true;
		int[] a = toSortedIntArray(pN, false);
		if (a != null) {
			for ( int i = 2; i < 7 && val; i++) {
				int[] b = toSortedIntArray(pN*i, true);
				if (!Arrays.equals(a, b) ) val = false;
			}
		} else {
			val = false;
		}
		return val;
	}
	
	private int[] toSortedIntArray(int pN, boolean pB) {
		char[] s = ("" + pN).toCharArray();
		int[] retArray = null;
		if (s[0] == '1' || pB) {
			Arrays.sort(s);
			retArray = new int[s.length];
			for (int i = 0; i < s.length; i++) {
				retArray[i] = Integer.parseInt("" + s[i]);
			}
		}
		return retArray;
	}
	
	

	public int getAnswer(){
		return answer;
	}	
}
