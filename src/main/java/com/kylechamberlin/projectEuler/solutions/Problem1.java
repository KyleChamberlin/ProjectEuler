package com.kylechamberlin.projectEuler.solutions;

public class Problem1 extends Solution{

    public Problem1(){
        sumMultiplesofThreeOrFiveLessThan(1000);
    }

    private int sumMultiplesofThreeOrFiveLessThan(int limit) {
        for (int i = 1; i < limit; i++) {
            if (isMultipleOfThreeOrFive(i)) {
                answer += i;
            }
        }
        return sum;
    }

    private boolean isMultipleOfThreeOrFive(int multiple) {
        return isMultipleOfThree(multiple) || isMultipleOfFive(multiple);
    }

    private boolean isMultipleOfFive(int multiple) {
        return multiple%5==0;
    }

    private boolean isMultipleOfThree(int multiple) {
        return multiple%3==0;
    }
}
