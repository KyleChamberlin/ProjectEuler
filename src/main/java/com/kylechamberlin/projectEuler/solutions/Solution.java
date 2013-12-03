package com.kylechamberlin.projectEuler.solutions;

public abstract class Solution {
    protected long answer = 0;

    public String solution() {
        return String.valueOf(answer);
    }

    public abstract void solve();
}
