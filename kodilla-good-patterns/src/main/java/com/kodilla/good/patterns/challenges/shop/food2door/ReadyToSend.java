package com.kodilla.good.patterns.challenges.shop.food2door;


import java.util.List;


public class ReadyToSend {

    public void sendOrder(List<OrderRequest> orderRequestList) {

        orderRequestList.stream()

                .map(n -> {

                    System.out.println("Dear: " + n.getSupplier().getName());
                    return n.createProductList();

                })
                .forEach(t-> System.out.println("Your order: " + t));

    }

}
