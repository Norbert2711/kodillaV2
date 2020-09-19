package com.kodilla.testing.shape;

public class Circle implements Shape {

    public double r;

    public Circle( double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "I'm a Circle.";
    }

    @Override
    public double getField() {
        return Math.PI * (r * r);
    }

    @Override
    public String toString() {
        return "Circle" +
                " r= " + r ;
    }
}
