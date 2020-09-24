package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {

    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postQuantity;


    public ForumUser(int id, String name, char sex, int year, int month, int day, int postQuantity) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.postQuantity = postQuantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
