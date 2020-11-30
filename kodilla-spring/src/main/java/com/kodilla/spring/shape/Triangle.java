package com.kodilla.spring.shape;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

    @Override
    public String getNameShape() {
        return "This is a Triangle";
    }

}
