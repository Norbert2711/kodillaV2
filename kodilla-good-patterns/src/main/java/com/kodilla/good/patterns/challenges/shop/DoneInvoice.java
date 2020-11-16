package com.kodilla.good.patterns.challenges.shop;


public class DoneInvoice {

    public InitialInvoice process() {

        User user = new User("Adam", "Siedlecki",
                "25", "67-123", "Warszawa", "Szeroka 10B / 20");

        Clothes clothes = new Clothes("Bokserki męskie", "Bielizna",
                34.0, 2, true);

        GardenAccessories gardenAccessories = new GardenAccessories("Szpadel ogrodowy",
                1, 58.03, false);

        TypesOfDelivery typesOfDelivery = new TypesOfDelivery("DPD",
                "13.04.2020", "18.04.2020", 21);

        TypesOfPayment paymentMethod = new TypesOfPayment("MasterCard 453135");

        return new InitialInvoice(user, clothes, gardenAccessories, typesOfDelivery, paymentMethod);

    }

}
