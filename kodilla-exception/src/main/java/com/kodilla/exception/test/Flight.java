package com.kodilla.exception.test;

public class Flight {

    public String departureAirport;
    public String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight -> " + "FROM 'departureAirport': " + departureAirport + '\'' +
                ",TO 'arrivalAirport': " + arrivalAirport + " .";
    }
}
