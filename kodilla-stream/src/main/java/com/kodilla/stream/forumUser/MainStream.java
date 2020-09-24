package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class MainStream {

    public static void main(String[] args) {

        Forum forum = new Forum();
        LocalDate date = (LocalDate.now().minus(20, ChronoUnit.YEARS));
        Map<Integer, ForumUser> forumMap = forum.getForumUserList().stream()
                .filter(man -> man.getSex() == 'M')
                .filter(man -> ChronoUnit.YEARS.between(man.getDateOfBirth(), LocalDate.now()) > 20)
                .filter(man -> man.getPostQuantity() !=0)
                .collect(Collectors.toMap(ForumUser::getId, man -> man));

        forumMap.entrySet().stream()
                .map(man -> man.getKey() + " - ID: " + man.getValue())
                .forEach(System.out::println);


    }
}
