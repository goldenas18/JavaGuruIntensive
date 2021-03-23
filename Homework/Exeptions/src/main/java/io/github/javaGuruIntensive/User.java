package io.github.javaGuruIntensive;

public class User {




    private String firstName;
    private String lastName;
    private int age;

    public User(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName; }

    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age; }
    }


