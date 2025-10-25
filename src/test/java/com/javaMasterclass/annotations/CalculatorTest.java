package com.javaMasterclass.annotations;

import com.javaMasterclass.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operation Test")
public class CalculatorTest {

    @DisplayName("Test Addition of Two Number")
    @Test
    void addTest(){
        Calculator calculator = new Calculator();
        int addition = calculator.add(3,2);

        assertEquals(5,addition);
    }

    @DisplayName("Test Substraction of two number 👍")
    @Test
    void subTest(){
        Calculator calculator = new Calculator();
        int sub = calculator.subtract(3,2);

        assertEquals(1,sub);
    }
}
