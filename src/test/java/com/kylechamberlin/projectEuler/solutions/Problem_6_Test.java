package com.kylechamberlin.projectEuler.solutions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Problem_6_Test {

    private Problem6 problem6;

    @Before
    public void setUp() {
        problem6 = new Problem6();
    }

    @Test
    public void sum() {
           // assertTrue(problem6.leastCommonMultiple(3,5) == 15L);
    }

    @After
    public void tearDown() {
        problem6 = null;
    }
}
