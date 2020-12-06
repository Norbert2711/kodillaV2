package com.kodilla.patterns.builder.bigmack;

import com.kodilla.patterns.factory.builder.bigmack.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmackTestSuite {

    @Test
    public void makeMyBigmack() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("roll with sesame seeds")
                .burgers("Two burgers its 200 grams")
                .ingredients("cheese")
                .ingredients("tomato")
                .ingredients("lettuce")
                .ingredients("cucumber")
                .ingredients("mayo")
                .ingredients("orion")
                .build();

        System.out.println(bigmac);

        //When
        int allIngredients = 6;

        //Then
        Assert.assertEquals(6, allIngredients);

    }

}
