package com.kylechamberlin.projectEuler.solutions;

import org.junit.*;

import java.util.Random;

import static org.junit.Assert.*;

public class Problem_1_Test {

    private Problem1 problem1;

    @Before
    public void setUp() {
        problem1 = new Problem1();
    }

    @Test
    public void isMultipleOfThree() {
        Random random = new Random();
        int multiple;

        for (int i = 0; i < 100; i++) {
            multiple = 3 * random.nextInt(100);
            assertTrue(problem1.isMultipleOfThree(multiple));
        }
    }

    @Test
    public void isMultipleOfFive() {
        Random random = new Random();
        int multiple;

        for (int i = 0; i < 100; i++) {
            multiple = 5 * random.nextInt(100);
            assertTrue(problem1.isMultipleOfFive(multiple));
        }
    }

    @After
    public void tearDown() {
        problem1 = null;
    }
}
