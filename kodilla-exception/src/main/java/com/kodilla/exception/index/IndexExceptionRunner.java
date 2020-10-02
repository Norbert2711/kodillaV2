package com.kodilla.exception.index;

import java.util.List;

public class IndexExceptionRunner {

    public static void main(String[] args) {

        VideoCollector videoCollector = new VideoCollector();

        List<String> movies = videoCollector.getCollection();

        if (movies.size() > 2) {

            String firstMovie = movies.get(0);
            System.out.println(firstMovie);

            String anotherMovie = movies.get(2);
            System.out.println(anotherMovie);

        }
    }
}
