package projectEuler;

public class Problem9 {

	int answer = 0;
	int a = 1;
	int b = 1;
	int c = 1;
	/**
	 * 
	 * @param args
	 */
	public Problem9(){
		loop : for(a=1;a+b+c<=1000;a++){
			for(b=1;a+b+c<=1000;b++){
				for(c=1;a+b+c<=1000;c++){
					if(a+b+c == 1000 && verifyTriple()){
							answer = a*b*c;
							break loop;
					}
				}
				c=1;
			}
			b=1;
		}			
	}
		
	public long getAnswer(){
		return answer;
	}
	
	private boolean verifyTriple() {
		boolean retVal = false;
		
		if((a*a + b*b) ==(c*c)){
			retVal = true;
		}
				
		return retVal;
	}
	
}
