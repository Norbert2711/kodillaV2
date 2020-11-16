package com.kodilla.good.patterns.challenges.shop;


public class InitialInvoice {

    public User user;
    public Clothes clothes;
    public GardenAccessories gardenAccessories;
    public TypesOfDelivery typesOfDelivery;
    public TypesOfPayment typesOfPayment;

    public InitialInvoice(User user, Clothes clothes, GardenAccessories gardenAccessories,
                          TypesOfDelivery typesOfDelivery, TypesOfPayment paymentMethod) {
        this.user = user;
        this.clothes = clothes;
        this.gardenAccessories = gardenAccessories;
        this.typesOfDelivery = typesOfDelivery;
        this.typesOfPayment = paymentMethod;
    }

    public User getUser() {
        return user;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public GardenAccessories getGardenAccessories() {
        return gardenAccessories;
    }

    public TypesOfDelivery getTypesOfDelivery() {
        return typesOfDelivery;
    }

    public TypesOfPayment getTypesOfPayment() {
        return typesOfPayment;
    }

    @Override
    public String toString() {
        return "InitialInvoice{" +
                "user=" + user +
                ", clothes=" + clothes +
                ", gardenAccessories=" + gardenAccessories +
                ", typesOfDelivery=" + typesOfDelivery +
                ", typesOfPayment=" + typesOfPayment +
                '}';
    }
}