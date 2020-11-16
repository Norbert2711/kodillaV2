package com.kodilla.good.patterns.challenges.shop.food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderRequest {

    public Supplier supplier;
    public OrderInterface orderInterface;
    public Map<Products,Integer> productsList;

    public OrderRequest(Supplier supplier, Map<Products, Integer> productsList) {
        this.supplier = supplier;
       // this.orderInterface = orderInterface;
        this.productsList = productsList;
    }

    public OrderRequest() {
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public OrderInterface getOrderInterface() {
        return orderInterface;
    }

    public Map<Products, Integer> getProductsList() {
        return productsList;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "extraFoodShop=" + supplier +
                ", orderInterface=" + orderInterface +
                ", productsList=" + productsList +
                '}';
    }

    public List<OrderRequest> createProductList() {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        Map<Products,Integer> list = extraFoodShop.createProductList();

        Supplier supplier1 = new Supplier("Adam");

        List<OrderRequest> products = new ArrayList<>();

        products.add(0,new OrderRequest(supplier1,list));

        return products;
    }
}
