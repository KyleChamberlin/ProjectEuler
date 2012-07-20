package projectEuler;

public class Problem16 {
	
	int[] a;
	int answer = 0;

	public Problem16(){
		answer = sumDigits(bigPower(2,1000));		
	}
	
	public int getAnswer(){
		return answer;
	}
	
	public int[] bigPower(int pN, int pn){
		int[] number = new int[(int) Math.ceil(Math.log10(pN)*pn) + 1];
		java.util.Arrays.fill(number,0);		
		number[0]=pN;
		for(int n = 1; n < pn; n++){
			for(int i = 0; i < number.length; i++){
				number[i] = number[i]*2;
			}
			for(int j=0;j<number.length;j++){
				if(number[j]>=10){
					number[j+1]+=(number[j]/10);
					number[j]=number[j]%10;					
				}
			}
		}
		return number;
	}
	
	private int sumDigits(int[] pDigits){
		int sum = 0;
		for(int i : pDigits){
			sum += i;
		}
		return sum;
	}
}
