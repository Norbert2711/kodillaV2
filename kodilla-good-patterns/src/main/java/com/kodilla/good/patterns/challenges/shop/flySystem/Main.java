package com.kodilla.good.patterns.challenges.shop.flySystem;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        SearchFlySystem searchFlySystem = new SearchFlySystem();

        HashSet<Flights> allFlies = searchFlySystem.availableFlights();
        Set<Flights> availableConnection = searchFlySystem.searchCitiesConnect("KRAKOW", "NYC");
        //System.out.println("for example choose 2 cities like: -> 'KRAKOW' & 'NYC'");
       // System.out.print(allFlies);
        System.out.println(availableConnection);

    }

}
