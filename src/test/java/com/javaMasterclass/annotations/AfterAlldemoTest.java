package com.javaMasterclass.annotations;

import com.javaMasterclass.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfterAlldemoTest {

    private static Calculator calculator;

    @BeforeAll
    static void setUpBeforeClass() {
        calculator = new Calculator();
        System.out.println("setUpBefore class method called...");
    }

    @AfterAll
    static void tearDownAfterClass() {
        calculator = null;
        System.out.println("tearDownAfterClass method called...");
    }

//    @BeforeEach
//    void setUp() {
//        calculator = new Calculator();
//        System.out.println("setUp method called...");
//    }

    @Test
    void addTest() {
        int addition = calculator.add(1, 2);
        assertEquals(3, addition);
        System.out.println("addTest method called...");
    }

    @Test
    void subtractTest() {
        int subtraction = calculator.subtract(5, 2);
        assertEquals(3, subtraction);
        System.out.println("substractTest method called...");
    }

    @Test
    void multiplyTest() {
        int multiplication = calculator.multiply(5, 2);
        assertEquals(10, multiplication);
        System.out.println("multiplicationTest method called...");
    }

    @Test
    void divideTest() {
        int division = calculator.divide(6, 2);
        assertEquals(3, division);
        System.out.println("divisionTest method called...");
    }
}
