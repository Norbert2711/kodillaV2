package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TestPeopleQuantity {

    @Test
    public void testGetPeopleQuantity() {

        Country polska = new Country("Poland", new BigDecimal("12"));
        Country niemcy = new Country("Germany", new BigDecimal("12"));
        Country francja = new Country("France", new BigDecimal("12"));
        Country ukraina = new Country("Ukraine", new BigDecimal("12"));

        Country palauu = new Country("Pallau", new BigDecimal("20"));
        Country newZeland = new Country("New Zeland", new BigDecimal("20"));
        Country wellington = new Country("Wellington", new BigDecimal("20"));
        Country ngerulmud = new Country("Ngerulmud", new BigDecimal("20"));


        Continent europe = new Continent("Europe");
        europe.addCountry(polska);
        europe.addCountry(niemcy);
        europe.addCountry(francja);
        europe.addCountry(ukraina);

        Continent australia = new Continent("Australia");
        australia.addCountry(palauu);
        australia.addCountry(newZeland);
        australia.addCountry(wellington);
        australia.addCountry(ngerulmud);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(australia);
        BigDecimal people = world.getPeopleQuantity();

        System.out.println(people);
        BigDecimal expectedPeopleQuantity = new BigDecimal("128");

        Assert.assertEquals(expectedPeopleQuantity, people);
    }

}
