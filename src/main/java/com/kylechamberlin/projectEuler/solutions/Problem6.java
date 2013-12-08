package com.kylechamberlin.projectEuler.solutions;



public class Problem6 extends Solution{

    @Override
    public void solve() {
        answer = square(sumFromOneTo(100)) - sumOfSquaresFromOneTo(100);
    }

    protected long sumFromOneTo(int limit) {
        long sum = 0;
        for(int i = 1; i <= limit; i++) {
            sum += i;
        }
        return sum;
    }

    protected long square(long number) {
        return number * number;
    }

    protected long sumOfSquaresFromOneTo(int limit) {
        long sum = 0;
        for(int i = 1; i <= limit; i++) {
            sum += square(i);
        }

        return sum;
    }
}
