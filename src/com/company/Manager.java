package com.company;

/**
 * Created by Constantine on 22.08.2015.
 */
public class Manager extends Person implements Payable, Vacationable {

    Manager(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public void manage(Developer developer, String task) {
        System.out.println("I'm managing " + developer.getFirstName() + " " + developer.getLastName()
                + " to do the " + task);
    }

    @Override
    public void increaseSalary() {
        double salary = this.getSalary();
        salary += 1800;
        System.out.println("Good job! Take a little bonus " + salary);
    }

    @Override
    public int changeId() {
        int id = this.getId();
        return id += 5;
    }

    @Override
    public void giveVacation() {
        System.out.println("There is two tickets to the Spain for you, " + this.getFirstName());
    }
}