package projectEuler;



public class Problem5 {

	long answer = 0L;
	
	/**
	 * 
	 * @param args
	 */
	public Problem5(){
		long i = 20L;
		while (answer != i){
			i +=2;
			inner : for(int j = 3;j<21;j++){
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
