package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests.");

    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");

    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test number.# " + testCounter);

    }

    @Test
    public void addShape(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(4.0);

       //When
        shapeCollector.addFigure(circle);
        System.out.println("Name: " + circle.getShapeName() + " My field: " + circle.getField());

        int size = shapeCollector.allShapes.size();

        //Then
        Assert.assertEquals(1, size);

    }

    @Test
    public void removeShape(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(6.0);
        Triangle triangle = new Triangle(3.7, 2.6);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        System.out.println("All shapes: "+ shapeCollector.getAllShapes());

        shapeCollector.removeFigure(circle);
        shapeCollector.removeFigure(triangle);
        System.out.println("after remove this shapes left : "+ shapeCollector.getAllShapes());

        boolean result = shapeCollector.allShapes.isEmpty();

        //Then
        Assert.assertTrue(result);

    }

    @Test
    public void getOneFigure(){

        //Given
        Circle circle = new Circle(6.0);
        Triangle triangle = new Triangle(3.7, 2.6);
        Square square = new Square(6);

        //When
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        Shape result = shapeCollector.getFigure(2);

        //Then
        Assert.assertEquals(square, result);

    }

    @Test
    public void showAllFigures(){

        //Given
        Circle circle = new Circle(6.0);
        Triangle triangle = new Triangle(3.7, 2.6);
        Square square = new Square(6);

        //When
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        ArrayList results = shapeCollector.showFigures();
        ArrayList<Shape> res = shapeCollector.allShapes;

       //They
        System.out.println(res);
        System.out.println(results);

        Assert.assertEquals(res, results);

    }

}
