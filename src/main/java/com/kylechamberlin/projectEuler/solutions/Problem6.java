package com.kylechamberlin.projectEuler.solutions;

public class Problem6 extends Solution{

    @Override
    public void solve() {
        long sqSum = 0;
        long sumSq = 0;
        for(int i = 1;i<101;i++){
            sqSum += i;
            sumSq += i * i;
        }
        sqSum *= sqSum;

        answer = sqSum - sumSq;
    }
}
