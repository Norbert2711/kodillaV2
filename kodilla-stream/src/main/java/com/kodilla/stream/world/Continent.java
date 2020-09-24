package com.kodilla.stream.world;

import java.util.ArrayList;

public class Continent {

    public ArrayList<Country> countries = new ArrayList<>();
    public String continentName;

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void addCountry( Country country) {
        countries.add(country);
    }

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    @Override
    public String toString() {
        return "Continent{" + "continentName: " + continentName +
                "countries=" + countries;
    }

}
