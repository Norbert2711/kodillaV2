package com.kodilla.testing.shape;

public class Triangle implements Shape {

   public double a;
   public double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "I'm a Triangle.";
    }

    @Override
    public double getField() {
        return (1 / 2) * a * h;
    }


    @Override
    public String toString() {
        return "Triangle " +
                "a= " + a +
                ", h= " + h ;
    }
}
