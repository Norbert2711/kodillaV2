package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args)  {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1.8, 1.5);

        } catch (Exception e) {
            System.out.println("little Error");
        } finally {
            System.out.println("done");
        }
    }
}