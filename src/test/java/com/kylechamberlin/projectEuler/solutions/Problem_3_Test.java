package com.kylechamberlin.projectEuler.solutions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem_3_Test {

    private Problem3 problem3;

    @Before
    public void setUp() {
        problem3 = new Problem3();
    }

    @Test
    public void sumWithAnswerIfEvenOnlyIncreasesAnswerWhenParameterIsEven() {
        assertEquals("2", problem3.solution());
    }


    @Test
    public void nextProperlyIncredmentsFibinociNumbers() {
    }


    @After
    public void tearDown() {
        problem3 = null;
    }
}
