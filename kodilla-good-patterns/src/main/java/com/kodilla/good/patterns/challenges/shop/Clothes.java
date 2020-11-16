package com.kodilla.good.patterns.challenges.shop;

public class Clothes {

    public User user;
    public String name;
    public String type;
    public double quantity;
    public double price;
    public boolean exist;

    public Clothes(String name, String type, double quantity, double price, boolean exist) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.exist = exist;
    }

    public User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public String getType() { return type; }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isExist() {
        return exist;
    }

    @Override
    public String toString() {
        return ", name='" + name + "type: " + type + '\'' +
                ", quantity=" + quantity +
                ", price=" + price + "exist ? --> " + exist;
    }


}
