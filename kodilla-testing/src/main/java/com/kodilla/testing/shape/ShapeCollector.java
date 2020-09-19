package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> allShapes = new ArrayList<>();

    public ShapeCollector() {

    }

    public ArrayList<Shape> getAllShapes() {
        return allShapes;
    }

    public void addFigure(Shape shape) {
        allShapes.add(shape);

    }

    public void removeFigure(Shape shape) {

        boolean result = false;
        if (allShapes.contains(shape)) {
            allShapes.remove(shape);
            result = true;

        }

    }

    public Shape getFigure(int n) {

        Shape figure = null;
        if (n >= 0 && n < allShapes.size()) {
            figure = allShapes.get(n);
        }

        return figure;

    }

    public ArrayList showFigures() {

        for (Shape allFigures : allShapes) {
            System.out.println("All figures in collection: " + allFigures);

        }
        return allShapes;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "allShapes=" + allShapes +
                '}';
    }
}
