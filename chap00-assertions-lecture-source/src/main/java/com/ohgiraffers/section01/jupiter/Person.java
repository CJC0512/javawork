package com.ohgiraffers.section01.jupiter;

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.lastName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String secondName) {
        this.lastName = secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                '}';
    }
}
