package projectEuler;



public class Problem4 {

	int answer = 0;
	
	/**
	 * 
	 * @param args
	 */
	public Problem4(){
		for(int x = 100;x<1000;x++){
			for(int y = 100; y<1000;y++){
				int product = x * y;
				
				if(palindromeCheck(product)){
					if (product > answer){
						answer = product;
					}
				}
			}
		}
	}
	
	public long getAnswer(){
		return answer;
	}
	
	private boolean palindromeCheck(int pNumber){
		boolean check = false;
		int[] digits = new int[]{0,0,0,0,0,0};
		int mod2 = 0;
		int j = 0;
		for(int i = 10;i<10000000;i*=10){
			int mod1 = pNumber%i;
			mod1 -= mod2;
			int divisor = i/10;
			digits[j] = (mod1/divisor);
			mod2 = mod1;
			j++;
		}
		if (pNumber > 99999){
			if(digits[0] == digits[5] && digits[1] == digits[4] && digits[2] == digits[3]){
				check = true;
			}
		} else {
			if(digits[0] == digits[4] && digits[1] == digits[3]){
				check = true;
			}
		}

		return check;
	}

}
