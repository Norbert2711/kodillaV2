package com.kodilla.good.patterns.challenges.shop.food2door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop  implements OrderInterface{

    public Map<Products, Integer> createProductList() {

        Map<Products, Integer> products = new HashMap<>();

        products.put(new Products("Bread"), 4);
        products.put(new Products("Coffee"), 5);
        products.put(new Products("Cheese"), 23);
        products.put(new Products("Water"), 7);
        products.put(new Products("Eggs"), 87);
        products.put(new Products("Chocolate"), 2);

        return products;
    }

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
