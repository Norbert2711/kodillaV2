package com.kodilla.good.patterns.challenges.shop.food2door;

import java.util.Map;

public class HealthyShop implements OrderInterface {

    @Override
    public boolean process(Supplier supplier, Map<Products, Integer> products) {

        for (Map.Entry<Products, Integer> entry : products.entrySet()) {
            if (entry.getValue() < 0) {
                System.out.println("Please add a products to Your Order!");
                return false;
            }
            System.out.println("Products has been add to Your Order!");
        }

        return true;

    }

}
