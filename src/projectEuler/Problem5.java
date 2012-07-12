package projectEuler;



public class Problem5 {

	long answer = 0L;
	
	/**
	 * 
	 * @param args
	 */
	public Problem5(){
		long i = 19L;
		while (answer != i){
			i++;
			inner : for(int j = 2;j<21;j++){
				if(i%j != 0){
					break inner;
				}
				if(j==20){
					answer = i;
				}
			}
		}
	}
	
	public long getAnswer(){
		return answer;
	}
	
	
}
