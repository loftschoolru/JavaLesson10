package com.company;

public class Main {

    public static void main(String[] args) {

        Person[] person = new Person[4];

        person[0] = new Developer("Linus", "Torvalds", 1);
        person[1] = new Developer("John", "Carmack", 2);

        person[2] = new Manager("Lilly", "Smith", 3);
        person[3] = new Manager("Jane", "Brooks", 4);

        for (Person p: person) {
            p.giveVacation();
        }
    }
}
