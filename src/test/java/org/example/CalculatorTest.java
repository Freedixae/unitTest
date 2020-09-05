package org.example;

import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    @org.junit.jupiter.api.Test
    void sumTest () {
        //given
        Calculator calculator = Calculator.instance.get();
        int i = (int) (Math.random() * 20);
        int j = (int) (Math.random() * 20);
        //when
        int result = calculator.plus.apply(i, j);
        //then
        Assertions.assertEquals(result, i+j);
    }

    @org.junit.jupiter.api.Test
    void powTest () {
        //given
        Calculator calculator = Calculator.instance.get();
        int i = (int) (Math.random() * 10000);
        //when
        int result = calculator.pow.apply(i);
        //then
        Assertions.assertNotEquals(i, result);
    }

    @org.junit.jupiter.api.Test
    void absTest () {
        //given
        Calculator calculator = Calculator.instance.get();
        int i = (int) (Math.random() * -10000);
        //when
        int result = calculator.abs.apply(i);
        //then
        Assertions.assertNotEquals(i, result);
    }
}
