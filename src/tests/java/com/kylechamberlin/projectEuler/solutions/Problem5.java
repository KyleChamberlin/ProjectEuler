package projectEuler;



public class Problem5 {

	long answer = 0L;
	
	/**
	 * 
	 * @param args
	 */
	public Problem5(){
		long i = 20L;
		while (answer == 0){
			i +=20;
			inner : for(int j = 19;j>=11;j--){
				if(i%j != 0){
					break inner;
				}
				if(j==11){
					answer = i;
				}
			}
		}
	}
	
	public long getAnswer(){
		return answer;
	}
	
	
}
