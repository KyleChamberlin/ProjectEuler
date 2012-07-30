package projectEuler;

import java.util.BitSet;

public class Problem201 {
	
	protected BitSet set = new BitSet(100);
	protected int[] values = new int[100];
	int answer = 0;

	public Problem201(){
		for(int i = 0; i < 100; i++){
			values[i] = (i+1)*(i+1);
		}
		set.set(0,set.size(),true); 
		for(int i = 0; i < 100; i++){
			setBit(i);
		}
		
		
	}
	
	private void setBit(int pBit){
		int length = (int) set.size() / 4;
		if(set.get(pBit)){
			
		}
		
	}
	
	private long sum(int[] pNums){
		long sigma = 0;
		for(int i : pNums){
			sigma += i;
		}
		return sigma;
	}
	
	public int getAnswer(){
		return answer;
	}
}
