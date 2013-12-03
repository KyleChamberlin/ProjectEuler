package projectEuler;

public class Problem14 {

	int answer = 0;
	/**
	 * 
	 * @param args
	 */
	public Problem14(){
		int highest = 0;
		for(int num = 0;num < 1000000; num++){
			int temp = countTerms(num);
			if (temp > highest){
				highest = temp;
				answer = num;
			}
		}
	}
	
	public int getAnswer(){
		return answer;
	}
	
	private int countTerms(int pN){
		int count = 1;
		long n = pN;
		while(n>1){
			if(n%2==0){
				n/=2;
			} else {
				n = 3*n +1;
			}
			count++;			
		}
		return count;
	}
}
