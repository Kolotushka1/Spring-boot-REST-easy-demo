package com.luv2code.demo.entity;

public class Student {
    private String newName;
    private String lastName;

    public Student() {

    }

    public Student(String newName, String lastName) {
        this.newName = newName;
        this.lastName = lastName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}