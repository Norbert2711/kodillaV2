package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    Display display;

    public double add(double a, double b) {
        return display.displayValue(a + b);

    }

    public double subtract(double a, double b) {
        return display.displayValue(a - b);
    }

}
