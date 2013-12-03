package projectEuler;



public class Problem6 {

	long answer = 0L;
	
	/**
	 * 
	 * @param args
	 */
	public Problem6(){
		long sqSum = 0;
		long sumSq = 0;
		for(int i = 1;i<101;i++){
			sqSum += i;
			sumSq += i * i;
		}
		sqSum *= sqSum;
		
		answer = sqSum - sumSq;
	}
	
	public long getAnswer(){
		return answer;
	}
	
	
}
