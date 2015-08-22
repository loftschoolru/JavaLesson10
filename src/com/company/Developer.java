package com.company;

/**
 * Created by Constantine on 22.08.2015.
 */
public class Developer extends Person implements Payable, Vacationable{

    Developer(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public void develop(String task) {
        System.out.println("I'm doing the " + task + " now");
    }

    @Override
    public int changeId() {
        int id = this.getId();
        return id += 10;
    }

    @Override
    public void increaseSalary() {
        double salary = this.getSalary();
        salary += 1500;
        System.out.println("Good job! Take a little bonus: " + salary);
    }

    @Override
    public void giveVacation() {
        System.out.println("There is two tickets to the Bahamas for you, " + this.getFirstName());
    }
}