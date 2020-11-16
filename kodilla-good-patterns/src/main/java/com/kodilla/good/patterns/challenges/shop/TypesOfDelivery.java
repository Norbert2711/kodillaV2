package com.kodilla.good.patterns.challenges.shop;

public class TypesOfDelivery {

    public String name;
    public String from;
    public String to;
    public double cost;

    public TypesOfDelivery(String name, String from, String to, double cost) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "TypesOfDelivery{" +
                "name='" + name + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", cost=" + cost +
                '}';
    }
}
