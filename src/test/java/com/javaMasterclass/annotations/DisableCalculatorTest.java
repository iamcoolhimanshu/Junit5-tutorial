package com.javaMasterclass.annotations;

import com.javaMasterclass.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DisableCalculatorTest {

    @Disabled("Disable until bug #40 is fix")
    @Test
     void addTest() {
        Calculator calculator = new Calculator();
        int addition = calculator.add(1,2);

        assertEquals(3,addition);
    }
    @Test
    void subtractTest() {
        Calculator calculator = new Calculator();
        int subtraction = calculator.subtract(5,2);

        assertEquals(3,subtraction);
    }
    @Test
    void multiplyTest() {
        Calculator calculator = new Calculator();
        int multiplication = calculator.multiply(5,2);

        assertEquals(10,multiplication);
    }
    @Test
    void divideTest() {
        Calculator calculator = new Calculator();
        int division = calculator.divide(6,2);

        assertEquals(3,division);
    }
}
