package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void arrayAverageTests() {

        int[] arrayOfNumbers = new int[20];

        arrayOfNumbers[0] = 8;
        arrayOfNumbers[1] = 4;
        arrayOfNumbers[2] = 1;
        arrayOfNumbers[3] = 5;
        arrayOfNumbers[4] = 45;
        arrayOfNumbers[5] = 12;
        arrayOfNumbers[6] = 67;
        arrayOfNumbers[7] = 3;
        arrayOfNumbers[8] = 9;
        arrayOfNumbers[9] = 7;
        arrayOfNumbers[10] = 34;
        arrayOfNumbers[11] = 56;
        arrayOfNumbers[12] = 12;
        arrayOfNumbers[13] = 67;
        arrayOfNumbers[14] = 76;
        arrayOfNumbers[15] = 43;
        arrayOfNumbers[16] = 23;
        arrayOfNumbers[17] = 2;
        arrayOfNumbers[18] = 3;
        arrayOfNumbers[19] = 8;

        double result = ArrayOperations.getAverage(arrayOfNumbers);

        System.out.println(result);

        Assert.assertEquals(24.25, result, 0.1);
    }
}
