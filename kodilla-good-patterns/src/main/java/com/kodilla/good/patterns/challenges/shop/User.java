package com.kodilla.good.patterns.challenges.shop;

public class User {

    public String name;
    public String surname;
    public String age;
    public String city;
    public String zipCode;
    public String street;

    public User(String name, String surname, String age, String zipCode, String city, String street) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;

    }

    public String getAddress() {
        return city;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "User: " +
                "name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", age: " + age +
                ", address:" +" "+ zipCode+ " " + city+" " + street + '\'';
    }

}
