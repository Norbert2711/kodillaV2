package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> even = new ArrayList<>();

        for (Integer evenNumbs : numbers) {
            if (evenNumbs % 2 == 0) {
                even.add(evenNumbs);
            }
        }

        return even;
    }

}
