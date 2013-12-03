package com.kylechamberlin.projectEuler.solutions;

public class Problem2 extends Solution{

    protected int fibA = 1;
    protected int fibB = 1;
    private int limit = 4000000;

    public Problem2(){
	}

    protected void sumWithAnswerIfEven(int number) {
        if(number%2==0){
            answer += number;
        }
    }

    protected void next(){
		int hold = fibA + fibB;
		fibA = fibB;
		fibB = hold;		
	}

    @Override
    public void solve() {
        for(;fibB< limit;next()){
            sumWithAnswerIfEven(fibB);
        }
    }
}
