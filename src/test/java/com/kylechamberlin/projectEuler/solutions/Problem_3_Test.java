package com.kylechamberlin.projectEuler.solutions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;


public class Problem_3_Test {

    private Problem3 problem3;

    @Before
    public void setUp() {
        problem3 = new Problem3();
    }

    @Test
    public void PrimeFactorsOf13195() {
        int[] knownFactors = {5,7,13,29};
        List<Long> testFactors = problem3.primeFactors(13195);
        int i = 0;

        for (long factor : testFactors) {
            assertTrue(knownFactors[i] == factor);
            i++;
        }
    }

    @After
    public void tearDown() {
        problem3 = null;
    }
}
