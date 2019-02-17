package com.bdg.resourcemanagement.spapoyan;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private short age;


    public Person(String firstName, String lastName, String middleName, short age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public short getAge() {
        return age;
    }


}
