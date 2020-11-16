package com.kodilla.good.patterns.challenges.shop.food2door;

public class Supplier {

public String name;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                '}';
    }
}
