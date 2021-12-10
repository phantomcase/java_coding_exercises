package com.techreturners.exercise002;

public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private Integer age;

    public Person(String firstName, String lastName, String city, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public Integer getAge() {
        return age;
    }
}
