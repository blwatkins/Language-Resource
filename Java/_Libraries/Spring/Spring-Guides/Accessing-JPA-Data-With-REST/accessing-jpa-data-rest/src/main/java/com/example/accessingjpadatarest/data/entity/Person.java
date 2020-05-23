package com.example.accessingjpadatarest.data.entity;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
