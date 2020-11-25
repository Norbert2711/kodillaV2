package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testAddCalculator() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultAdd = calculator.add(3, 3);
        double subRes = calculator.subtract(10, 5);
        System.out.println(resultAdd);
        System.out.println(subRes);

        //Then
        Assert.assertEquals(6.0, resultAdd, 0.1);
        Assert.assertEquals(5.0, subRes, 0.2);

    }

}