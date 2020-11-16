package com.kodilla.good.patterns.challenges.shop.flySystem;

import java.util.Objects;

public class Flights {

    public String departure;    //wylot
    public String arrival; //przylot

    public Flights(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "Flights -> " +
                "departure from: " + departure + '\'' +
                ", arrival to: " + arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(departure, flights.departure) &&
                Objects.equals(arrival, flights.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }
}
