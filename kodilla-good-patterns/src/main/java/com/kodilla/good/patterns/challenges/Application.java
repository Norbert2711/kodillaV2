package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.shop.DoneInvoice;
import com.kodilla.good.patterns.challenges.shop.InitialInvoice;
import com.kodilla.good.patterns.challenges.shop.User;

public class Application {

    public static void main(String[] args) {

       DoneInvoice doneInvoice = new DoneInvoice();

        System.out.println(doneInvoice.process());

    }
}