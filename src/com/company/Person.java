package com.company;

/**
 * Created by Constantine on 22.08.2015.
 */
public abstract class Person implements Payable, Vacationable{

    private String firstName;
    private String lastName;
    private int id;
    private double salary;

    Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract int changeId();

}
