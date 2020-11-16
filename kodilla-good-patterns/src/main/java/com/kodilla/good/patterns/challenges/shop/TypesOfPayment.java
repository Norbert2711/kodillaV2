package com.kodilla.good.patterns.challenges.shop;

public class TypesOfPayment{

    public String name;

    public TypesOfPayment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TypesOfPayment{" +
                "name='" + name + '\'' +
                '}';
    }
}
