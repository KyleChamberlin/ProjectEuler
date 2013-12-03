package com.kylechamberlin.projectEuler.solutions;

import org.junit.*;

import static org.junit.Assert.*;


public class Problem_2_Test {

    private Problem2 problem2;

    @Before
    public void setUp() {
        problem2 = new Problem2();
    }

    @Test
    public void sumWithAnswerIfEvenOnlyIncreasesAnswerWhenParameterIsEven() {
        problem2.sumWithAnswerIfEven(2);
        problem2.sumWithAnswerIfEven(3);
        assertEquals("2", problem2.solution());
    }


    @Test
    public void nextProperlyIncredmentsFibinociNumbers() {
        assertEquals(1, problem2.fibA);
        assertEquals(1, problem2.fibB);

        problem2.next();

        assertEquals(1, problem2.fibA);
        assertEquals(2, problem2.fibB);

        problem2.next();

        assertEquals(2, problem2.fibA);
        assertEquals(3, problem2.fibB);

        problem2.next();

        assertEquals(3, problem2.fibA);
        assertEquals(5, problem2.fibB);

        problem2.next();

        assertEquals(5, problem2.fibA);
        assertEquals(8, problem2.fibB);

        problem2.next();

        assertEquals(8, problem2.fibA);
        assertEquals(13, problem2.fibB);

        problem2.next();
        problem2.next();
        problem2.next();
        problem2.next();
        problem2.next();
        problem2.next();

        assertEquals(144, problem2.fibA);
        assertEquals(233, problem2.fibB);
    }


    @After
    public void tearDown() {
        problem2 = null;
    }
}
