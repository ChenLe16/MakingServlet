package main.servlet.reqAttr.model;

//JavaBean
// 1. implements Serializable
// 2. No arg constructor
// 3. private members w/ getters and setters


import java.io.Serializable;

public class Person implements Serializable {

    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        this.firstName = "Chen Le";
        this.lastName = "Yong";
        this.age = 24;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
