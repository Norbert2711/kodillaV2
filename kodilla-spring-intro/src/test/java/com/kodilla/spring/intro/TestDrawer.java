package com.kodilla.spring.intro;

import com.kodilla.spring.intro.shape.Circle;
import com.kodilla.spring.intro.shape.Drawer;
import org.junit.Assert;
import org.junit.Test;

public class TestDrawer {

    @Test
    public void testDrawer() {

        Circle circle = new Circle();
        Drawer drawer = new Drawer(circle);
        String result= drawer.doDraw();
        System.out.println(drawer.doDraw());

        Assert.assertEquals("Circle", result);
    }

}
