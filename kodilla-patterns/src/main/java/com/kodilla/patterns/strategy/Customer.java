package com.kodilla.patterns.strategy;

public class Customer {

    final private String name;
    public BuyPredictor buyPredictor;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }

    public String predict(){
        return buyPredictor.predictWayToBuy();
    }

}
