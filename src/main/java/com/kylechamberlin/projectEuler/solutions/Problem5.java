package com.kylechamberlin.projectEuler.solutions;

public class Problem5 extends Solution {

	public void solve() {
         answer = leastCommonMultipleOf2Through(20);
	}

    protected long leastCommonMultipleOf2Through(long a, long b) {
        if ( a == 2L ) {
            return leastCommonMultiple(2, b);
        }
        return  leastCommonMultipleOf2Through(a - 1, leastCommonMultiple(a, b));
    }

    protected long leastCommonMultipleOf2Through(long a) {
        return leastCommonMultipleOf2Through(a,a);
    }

	protected long leastCommonMultiple(long a, long b) {
		long larger = a>b?a:b;
		long smaller = a>b?b:a;
        long multiple = larger;

		for (; (multiple % smaller) != 0L; multiple += larger);

		return multiple;
	}
}
