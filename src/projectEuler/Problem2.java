package projectEuler;

public class Problem2 {

	int answer = 0;
	int fibA = 1;
	int fibB = 1;
	/**
	 * 
	 * @param args
	 */
	public Problem2(){
		for(;fibB<4000000;next()){
			if(fibB%2==0){
				answer += fibB;
			}
		}
		
	}
	
	public int getAnswer(){
		return answer;
	}
	
	private void next(){
		int hold = fibA + fibB;
		fibA = fibB;
		fibB = hold;		
	}

}
