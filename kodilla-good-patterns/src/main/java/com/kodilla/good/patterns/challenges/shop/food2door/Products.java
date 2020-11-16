package com.kodilla.good.patterns.challenges.shop.food2door;


public class Products {

    public String products;

    public Products(String products) {
        this.products = products;
    }

    public String getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Products{" +
                "products=" + products +
                '}';
    }

}

