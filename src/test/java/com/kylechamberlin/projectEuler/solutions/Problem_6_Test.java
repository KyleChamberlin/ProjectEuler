package com.kylechamberlin.projectEuler.solutions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem_6_Test {

    private Problem6 problem6;

    @Before
    public void setUp() {
        problem6 = new Problem6();
    }

    @Test
    public void sumFromOneTo100is5050() {
            assertEquals(5050L, problem6.sumFromOneTo(100));
    }

    @Test
    public void sumFromOneTo10is55() {
            assertEquals(55L, problem6.sumFromOneTo(10));
    }

    @Test
    public void squareTwoIsFour() {
            assertEquals(4L, problem6.square(2));
    }

    @Test
    public void square100is10000() {
            assertEquals(10000L, problem6.square(100));
    }

    @Test
    public void sumOfSquaresFromOneToTwoIsFive() {
            assertEquals(5L, problem6.sumOfSquaresFromOneTo(2));
    }

    @Test
    public void sumOfSquaresFromOneToTenIs385() {
            assertEquals(385L, problem6.sumOfSquaresFromOneTo(10));
    }

    @After
    public void tearDown() {
        problem6 = null;
    }
}
