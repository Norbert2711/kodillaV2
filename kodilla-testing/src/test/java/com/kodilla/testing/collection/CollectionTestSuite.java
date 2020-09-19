package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        ArrayList<Integer> numbersList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbersList);

        System.out.println("List size: " + numbersList.size());
        //Then
        Assert.assertEquals(result, numbersList);
    }


    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> numbersList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        numbersList.add(2);
        numbersList.add(1);
        numbersList.add(5);
        numbersList.add(4);
        numbersList.add(9);
        numbersList.add(6);

        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbersList);
        System.out.println(result);

        ArrayList<Integer> even = new ArrayList<>();
        even.add(2);
        even.add(4);
        even.add(6);

        //Then
        Assert.assertEquals(result, even);
    }

}
