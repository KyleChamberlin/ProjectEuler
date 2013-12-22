package com.kylechamberlin.projectEuler.solutions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class Problem_4_Test {

    private Problem4 problem4;

    @Before
    public void setUp() {
        problem4 = new Problem4();
    }

    @Test
    public void palindrome9009() {
        assertTrue(problem4.isPalindrome(9009));
    }

    @After
    public void tearDown() {
        problem4 = null;
    }
}
