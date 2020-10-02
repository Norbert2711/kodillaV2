package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlyingSearcher {

    public Map<String, Boolean> airPorts;

    public FlyingSearcher() {
        airPorts = allAvailableConnections();
    }

    public boolean searchByNameIfAriPorIsExist(String airName) throws RouteNotFoundException {

        if (airPorts.containsKey(airName)) {
            return airPorts.get(airName);

        } else {
            throw new RouteNotFoundException();

        }
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        return searchByNameIfAriPorIsExist(flight.getDepartureAirport()) &&
                searchByNameIfAriPorIsExist(flight.getArrivalAirport());

    }

    public Map<String, Boolean> allAvailableConnections() {

        Map<String, Boolean> airportsList = new HashMap<>();

        airportsList.put("Niemcy", false);
        airportsList.put("Polska", false);
        airportsList.put("Anglia", true);
        airportsList.put("Belgia", true);
        airportsList.put("Grecja", false);
        airportsList.put("Luksemburg", true);

        return airportsList;

    }

}