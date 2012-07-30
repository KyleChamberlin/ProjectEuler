package projectEuler;

public class Problem250 {
	
	int[] a;
	long answer = 0;

	public Problem250(){
		int[] two1 = bigPower(2,125125);
		int[] two2 = bigPower(2,5050);
		int[] two3 = bigPower(2,25025);
		
		int[] sum = bigAdd(two1,two2);
		int[] ansArray = bigSub(sum,two3);
		
		String hold = "";
		
		for(int i = ansArray.length - 1; i >= 0 ; i--){
			hold += ansArray[i];
		}
		answer = Long.parseLong(hold);
	}
	
	public long getAnswer(){
		return answer;
	}
	
	public int[] bigPower(int pN, int pn){
		//int[] number = new int[(int) Math.ceil(Math.log10(pN)*pn) + 1];
		int[] number = new int[20];
		java.util.Arrays.fill(number,0);		
		number[0]=pN;
		for(int n = 1; n < pn; n++){
			for(int i = 0; i < 18; i++){
				number[i] = number[i]*pN;
			}
			for(int j=0;j<18;j++){
				if(number[j]>=10){
					number[j+1]+=(number[j]/10);
					number[j]=number[j]%10;					
				}
			}
		}
		return number;
	}
	
	public int[] bigSub(int[] pA, int[] pB){
		//int[] number = new int[(int) Math.ceil(Math.log10(pN)*pn) + 1];
		int[] number = new int[20];
		java.util.Arrays.fill(number,0);		
			for(int i = 0; i < 18; i++){
				number[i] = pA[i] - pB[i];
			}
			for(int j=0;j<18;j++){
				if(number[j]<0){
					number[j+1]-=1;
					number[j]+=10;					
				}
			}
		return number;
	}
	
	public int[] bigAdd(int[] pA, int[] pB){
		//int[] number = new int[(int) Math.ceil(Math.log10(pN)*pn) + 1];
		int[] number = new int[20];
		java.util.Arrays.fill(number,0);		
			for(int i = 0; i < 18; i++){
				number[i] = pA[i] + pB[i];
			}
			for(int j=0;j<18;j++){
				if(number[j]>=10){
					number[j+1]+=(number[j]/10);
					number[j]=number[j]%10;					
				}
			}
		return number;
	}	
}
