package com.kodilla.good.patterns.challenges.shop.flySystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchFlySystem {

    public HashSet<Flights> flightsHashMap = new HashSet<>();


    public HashSet<Flights> getFlightsHashMap() {
        return flightsHashMap;
    }

    public HashSet<Flights> availableFlights() {

        flightsHashMap.add(new Flights("WARSAW", "WROCLAW"));
        flightsHashMap.add(new Flights("WROCLAW", "WARSAW"));
        flightsHashMap.add(new Flights("WROCLAW", "GDANSK"));
        flightsHashMap.add(new Flights("KRAKOW", "WARSAW")); //from po sout
        flightsHashMap.add(new Flights("WARSAW", "NYC"));   //too po sout
        flightsHashMap.add(new Flights("KRAKOW", "NYC"));   //tu jesli
        flightsHashMap.add(new Flights("NYC", "WARSAW"));
        flightsHashMap.add(new Flights("NYC", "GDANSK"));
        flightsHashMap.add(new Flights("GDANSK", "WROCLAW"));
        flightsHashMap.add(new Flights("GDANSK", "KRAKOW"));
        flightsHashMap.add(new Flights("GDANSK", "WARSAW"));

        return flightsHashMap;

    }

    //jesli miasto startowe w zestawie jest takie samo jak miasto startowe w innym zestawie, zostaje dodane do listy "from",
    //nastepnie krok sie powtarza do uzyskania 'polaczenia' (takie same miasto w zestawie po przylocie)
    @Override
    public String toString() {
        return "SearchFlySystem{" +
                "flightsHashMap=" + flightsHashMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchFlySystem that = (SearchFlySystem) o;
        return Objects.equals(flightsHashMap, that.flightsHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightsHashMap);
    }

    public Set<Flights> searchFrom(String cityFrom) {

        return flightsHashMap.stream()
                .filter(flights -> flights.getDeparture().equals(cityFrom))
                .collect(Collectors.toSet());
    }

    public Set<Flights> searchTo(String cityTo) {
        return flightsHashMap.stream()
                .filter(flights -> flights.getArrival().equals(cityTo))
                .collect(Collectors.toSet());
    }

    public Set<Flights> searchCitiesConnect(String from, String to) {

        //example
        System.out.println("for example choose 2 cities like: -> 'KRAKOW' & 'NYC'");

        HashSet<Flights> allAvailableFlies = new HashSet<>();

        for (Flights froms : searchFrom(from)) {
            for (Flights too : searchTo(to)) {

                if (froms.getArrival().equals(too.getDeparture())) {

                    allAvailableFlies.add(froms);
                    System.out.println(froms + " -pair in base");

                    allAvailableFlies.add(too);
                    System.out.println(too + " -pair in base");
                }
            }
        }

        return allAvailableFlies;
    }
}
