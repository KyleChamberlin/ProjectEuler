package projectEuler;

public class Problem1 {

	int answer = 0;
	/**
	 * 
	 * @param args
	 */
	public Problem1(){
		for(int i=1;i<1000;i++){
			if(i%3==0 || i%5==0){
				answer += i;
			}
		}
	}
	
	public int getAnswer(){
		return answer;
	}
	
	

}
