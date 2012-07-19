package projectEuler;

public class Problem16 {
	
	int[] a;
	int answer = 0;

	public Problem16(){
		twoPower(1000);
		answer = sumDigits(a);		
	}
	
	public int getAnswer(){
		return answer;
	}
	
	public void twoPower(int pN){
		a = new int[(int) Math.ceil(Math.log10(2)*pN) + 1];
		java.util.Arrays.fill(a,0);		
		a[0]=2;
		for(int n = 1; n < pN; n++){
			for(int i = 0; i < a.length; i++){
				a[i] = a[i]*2;
			}
			for(int j=0;j<a.length;j++){
				if(a[j]>=10){
					a[j+1]+=(a[j]/10);
					a[j]=a[j]%10;					
				}
			}
		}
	}
	
	private int sumDigits(int[] pDigits){
		int sum = 0;
		for(int i : a){
			sum += i;
		}
		return sum;
	}
}
