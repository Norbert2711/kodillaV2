package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        double add = calculator.addAtoB(5, 5);
        System.out.println(add);

        double sub = calculator.subBfromB(15, 8);
        System.out.println(sub);

        if (add == 10) {
            System.out.println("Result add is correct, value is: " + add);
        } else
            System.out.println("Calculator is broken...");

        if (sub == 7) {
            System.out.println("Result subtract is correct, value is: " + sub);
        } else {
            System.out.println("Calculator is broken...");
        }
    }

}
