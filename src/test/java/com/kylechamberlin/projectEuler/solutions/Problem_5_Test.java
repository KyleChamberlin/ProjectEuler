package com.kylechamberlin.projectEuler.solutions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class Problem_5_Test {

    private Problem5 problem5;

    @Before
    public void setUp() {
        problem5 = new Problem5();
    }

    @Test
    public void leastCommonMultipleOf3and5is15() {
            assertTrue(problem5.leastCommonMultiple(3,5) == 15L);
    }

    @Test
    public void leastCommonMultipleOf4and8is8() {
            assertTrue(problem5.leastCommonMultiple(4,8) == 8L);
    }

    @Test
    public void leastCommonMultipleOf16and4is16() {
            assertTrue(problem5.leastCommonMultiple(16,4) == 16L);
    }

    @Test
    public void leastCommonMultipleOf37and37is37() {
            assertTrue(problem5.leastCommonMultiple(37,37) == 37L);
    }

    @Test
    public void leastCommonMultipleOf40and22is440() {
            assertTrue(problem5.leastCommonMultiple(40,22) == 440L);
    }

    @Test
    public void lcmOf2Through3() {
            assertTrue(problem5.leastCommonMultipleOf2Through(3) == 6L );
    }

    @Test
    public void lcmOf2Through4() {
            assertTrue(problem5.leastCommonMultipleOf2Through(4) == 12L );
    }

    @Test
    public void lcmOf2Through10() {
            assertTrue(problem5.leastCommonMultipleOf2Through(10) == 2520L );
    }

    @After
    public void tearDown() {
        problem5 = null;
    }
}
