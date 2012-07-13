package projectEuler;

import java.io.*;
import java.util.Scanner;

public class Problem13 {

	long answer = 0;
	int[][] numbers = new int[100][50];
	int[] answerHold = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	/**
	 * 
	 * @param args
	 */
	public Problem13(){
		loadData();
		for(int r=0;r<numbers.length;r++){
			addRow(r);
		}
		answer = findAnswer();
		
		
	}
		
	public long getAnswer(){
		return answer;
	}
	
	private int[] sumDigit(int pDigit1, int pDigit2) {
		int[] digitsSumed = new int[]{0,0};
		int digitSum = pDigit1+pDigit2;
		digitsSumed[1] = (digitSum%100-digitSum%10) / 10;
		digitsSumed[0] = digitSum%10;
		return digitsSumed;
	}
	
	private void  addRow(int pIndex){
		for(int i = 0; i < 50; i++){
			int[] sum1 = sumDigit(numbers[pIndex][i],answerHold[i]);
			answerHold[i]=sum1[0];
			for(int j = i+1; j < answerHold.length && sum1[1] > 0; j++){
				sum1 = sumDigit(answerHold[j],sum1[1]);
				answerHold[j] = sum1[0];
			}
		}
	}
	
	private long findAnswer(){
		long found = 0;
		String rev = "";
		
		for(int digit : answerHold){
			rev += digit;
		}

		String straight = reverseIt(rev);

		int foundIndex = 0;
		for(int index = 0;index<straight.length();index++){
			if(straight.charAt(index) != '0'){
				foundIndex=index;
				break;
			}
		}
		String hold = "";
		for(int index = foundIndex;index < foundIndex +10;index++){
			hold += straight.charAt(index);
		}

		found = Long.parseLong(hold);

		
		
		return found;
	}
	
	private static String reverseIt(String a) {
		
		int length = a.length();
		StringBuilder reverse = new StringBuilder();
		for(int i = length; i > 0; --i) {
			char result = a.charAt(i-1);
			reverse.append(result);
		}
		return reverse.toString();
	}
	
	private void loadData(){
		try{
			FileInputStream fis = new FileInputStream("C:/GitCode/ProjectEuler/data/Problem13.txt");
			Scanner scanner = new Scanner(fis);
			
			for(int line = 0; line < 100; line++)
			{
				
				String temp = scanner.nextLine();
				for(int index = 49; index >= 0; index--){
					numbers[line][index] = temp.charAt(49-index) - 48;
				}
			}
			scanner.close();
			fis.close();	
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("ërr");
		}
	}
}
