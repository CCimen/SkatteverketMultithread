package com.multithreadstep.Skatteverket.model;


public class Person {
    private long person_id;
    private String lastName;
    private String firstName;

    public Person() {
    }

    public Person(long person_id, String firstName, String lastName) {
        this.person_id = person_id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setPersonId(long person_id) {
        this.person_id = person_id;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName;
    }

}