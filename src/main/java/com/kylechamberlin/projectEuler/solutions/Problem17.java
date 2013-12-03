package projectEuler;

public class Problem17 {

	int answer = 0;
	int[] ones = new int[]{
			0,3,3,5,4,4,3,5,5,4
			};
	int[] teens = new int[]{
			3,6,6,8,8,7,7,9,8,8
			};
	int[] tens = new int[]{
			0,3,6,6,5,5,5,7,6,6
			};
	/**
	 * 
	 * @param args
	 */
	public Problem17(){
		int total = 0;
		for (int i=1; i<=1000;i++){
			System.out.println(i);
			total += countCharacterInNumber(i);
		}
		answer = total;
	}
	
	public int getAnswer(){
		return answer;
	}
	
	private int countCharacterInNumber(int pN){
		int count = 0;
		int lastTwo = pN%100;
		int hundreds = (pN%1000-lastTwo) / 100;
		int thou = (pN%10000 - hundreds - lastTwo) / 1000;
		if(lastTwo < 20 && lastTwo > 9){
			int toTranslate = lastTwo%10;
			System.out.println(lastTwo);
			count+=teens[toTranslate];
		} else {
			
			int lastDigit = lastTwo%10;
			
			int tensDigit = (lastTwo - lastDigit)/10;
			System.out.println("" + tensDigit + lastDigit);
			count += ones[lastDigit];
			count += tens[tensDigit];
		}
		if(pN > 99 && count >0){
			count += 3;
		}
		if (pN > 99 && hundreds > 0){
			count += 7;
			count += ones[hundreds];
		}
		if (pN >999){
			count += 8;
			count += ones[thou];
		}
		return count;
	}
}
