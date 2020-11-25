package com.kodilla.spring.intro.shape;

public class Drawer {

    public Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String doDraw() {

        return shape.draw();
    }

}
