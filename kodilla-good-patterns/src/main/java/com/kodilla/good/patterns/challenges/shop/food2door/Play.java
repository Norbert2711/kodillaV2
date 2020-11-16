package com.kodilla.good.patterns.challenges.shop.food2door;


public class Play {

    public static void main(String[] args) {

        OrderRequest orderRequest = new OrderRequest();
        orderRequest.createProductList();

        ReadyToSend readyToSend = new ReadyToSend();
        readyToSend.sendOrder(orderRequest.createProductList());

    }

}
