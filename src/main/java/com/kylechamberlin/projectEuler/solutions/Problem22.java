/**Problem 22 from projectEuler.net 
 * Posted 19 October 2001
 * Solution by Kyle Chamberlin
 * Solved 12 July 2012
 * Problem 2 is stated as :
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938  53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */

package projectEuler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem22 {

	long answer = 0;
	String[] names;
	
	
	/**
	 * 
	 * @param args
	 */
	public Problem22(){
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data/Problem22.names.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(fis);
	    names = splitNames(scanner.nextLine());
	    Arrays.sort(names);
	    for (int i = 0; i<names.length; i++ ) {
	    	answer += sumString(names[i]) * (i + 1);
	    	
	    }
	}
	
	public long getAnswer(){
		return answer;
	}
	
	private int sumString(String pS) {
		int size = pS.length();
		int sum = 0;
		System.out.println(pS);
		for (int i = 0; i < size; i++) {
			sum += ((int) pS.charAt(i)) - 64;
			System.out.println("  " + pS.charAt(i) + " -> " + (((int) pS.charAt(i)) - 64));
		}
		System.out.println("    = " + sum);
		return sum;
	}
	
	private String[] splitNames(String pS) {
		String[] s = pS.split(",");
		for (int i = 0; i < s.length; i++) { 
			s[i] = s[i].substring(1, s[i].length() -1);
		}
		return s;
	}

}
