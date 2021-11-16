package com.company;

public class Person implements Comparable {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public int compareTo(Object other) {
        // returner -1 hvis denne person kommer før anden person
        Person andenPerson = (Person) other;
        String voresFornavn = firstName;
        String andetFornavn = andenPerson.firstName;
        if (voresFornavn.compareTo(andetFornavn) <= 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
