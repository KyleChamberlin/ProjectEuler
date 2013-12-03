package com.kylechamberlin.projectEuler.solutions;

public class Problem1 extends Solution{

    private final int problemSumsTo = 1000;

    protected void sumMultiplesofThreeOrFive() {
        for (int i = 1; i < problemSumsTo; i++) {
            if ( isMultipleOfFive(i) || isMultipleOfThree(i) ) {
                answer += i;
            }
        }
    }

    protected boolean isMultipleOfFive(int multiple) {
        return (multiple % 5) == 0;
    }

    protected boolean isMultipleOfThree(int multiple) {
        return (multiple % 3) == 0;
    }

    @Override
    public void solve() {
        sumMultiplesofThreeOrFive();
    }
}
