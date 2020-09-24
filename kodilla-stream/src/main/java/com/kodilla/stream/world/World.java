package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public class World {

    public ArrayList<Continent> continentArrayList = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentArrayList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {

        return continentArrayList.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
