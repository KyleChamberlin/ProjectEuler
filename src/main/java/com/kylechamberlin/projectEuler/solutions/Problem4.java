package com.kylechamberlin.projectEuler.solutions;

public class Problem4 extends Solution {


	/**
	 * 
	 * @param args
	 */
	public Problem4(){
		for(int x = 100;x<1000;x++){
			for(int y = 100; y<1000;y++){
				int product = x * y;
				
				if(isPalindrome(product)){
					if (product > answer){
						answer = product;
					}
				}
			}
		}
	}

	protected boolean isPalindrome(int pNumber){
		boolean check = false;
		int[] digits = breakIntToDigitsArray(pNumber);
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

    protected int[] breakIntToDigitsArray(int pNumber) {
        int numberOfDigits = (int) Math.floor(Math.log10(pNumber));
        int[] digits = new int[numberOfDigits];
        int mod2 = 0;
        for(int i = 10, j = 0; j < numberOfDigits;i*=10, j++){
            int mod1 = pNumber%i;
            mod1 -= mod2;
            int divisor = i/10;
            digits[j] = (mod1/divisor);
            mod2 = mod1;
        }
        return digits;
    }

    private int getDigitAt() {
        return 0;
    }

    @Override
    public void solve() {

    }
}
