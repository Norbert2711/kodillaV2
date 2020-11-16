package com.kodilla.good.patterns.challenges.shop;

public class GardenAccessories {

    public String name;
    public double quantity;
    public double price;
    boolean isExist;

    public GardenAccessories(String name, double quantity, double price, boolean isExist) {

        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.isExist = isExist;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price = quantity * price;
    }

    public boolean isExist() {
        return isExist;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price + "is exist> --> " + isExist;

    }

}
