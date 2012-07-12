package projectEuler;

public class Problem13 {

	long answer = 0;
	int[][] numbers = new int[100][50];
	int[] answerHold = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	/**
	 * 
	 * @param args
	 */
	public Problem13(){
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
	
	private int[] sumDigit(int pDigit1, int pDigit2) {
		int[] digitsSumed = new int[]{0,0};
		int digitSum = pDigit1+pDigit2;
		digitsSumed[1] = (digitSum%100-digitSum%10) / 10;
		digitsSumed[0] = digitSum%10;
		return digitsSumed;
	}
	
	private void  addRow(int pIndex){
		for(int i = 0; i < numbers[pIndex].length; i++){
			int[] sum1 = sumDigit(numbers[pIndex][i],answerHold[i]);
			answerHold[i]=sum1[0];
			for(int j = i+1; j < answerHold.length && sum1[1] > 0; j++){
				sum1 = sumDigit(answerHold[j],sum1[1]);
			}
		}
	}
}
