package com.kodilla.testing.shape;

public class Square implements Shape {

    public double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "I'm a Square.";
    }

    @Override
    public double getField() {
        return a = a * a;
    }

    @Override
    public String toString() {
        return "Square" +
                " a= " + a;
    }
}
