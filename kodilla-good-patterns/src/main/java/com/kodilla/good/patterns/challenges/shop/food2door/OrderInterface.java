package com.kodilla.good.patterns.challenges.shop.food2door;

import java.util.Map;

public interface OrderInterface {

    boolean process(Supplier supplier, Map<Products,Integer> products);
}
