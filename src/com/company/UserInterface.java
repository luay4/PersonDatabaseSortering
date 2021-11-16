package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {

    private ArrayList<Person> persons = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean running = true;

        System.out.println("Welcome to the person database\n" +
                "Commands:\n" +
                "'new' for new user\n" +
                "'delete' to delete a user\n" +
                "'show' to see a list of the users");

        while (running) {
            System.out.print("Type in command: ");
            String input = scanner.next();
            System.out.println();

            switch (input) {
                case "new":
                    newUser();
                    break;
                case "delete":
                    deleteUser();
                    break;
                case "show":
                    seeUsers();
                    break;
                default:
                    System.out.println("Cannot do that");
            }
        }
    }

    public void newUser() {
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();

        Person person = new Person(firstName, lastName);
        persons.add(person);

        System.out.println(person + " has been added to the database");
    }

    public void deleteUser() {
        seeUsers();
        System.out.print("Type the number next to the user you want to delete: ");
        int choice = scanner.nextInt();
        Person selected = persons.get(choice - 1);
        persons.remove(choice - 1);
        System.out.println(selected + " has been deleted from the database");
    }

    public void seeUsers() {
        int count = 1;
        sort(persons);
        for (Person person : persons) {
            System.out.println(count + ". " + person);
            count++;
        }
    }

    private static void quicksort(ArrayList<Person> a, int p, int r) {
        if (p < r) {
            int i = p - 1;
            for (int j = p; j < r; j++) {
                if (a.get(j).compareTo(a.get(r)) <= 0) {
                    i++;
                    Person b = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, b);
                }
            }
            Person b = a.get(i + 1);
            a.set(i + 1, a.get(r));
            a.set(r , b);

            quicksort(a, p, i);
            quicksort(a, i + 2, r);
        }
    }

    public void sort(ArrayList<Person> persons) {
        quicksort(persons, 0 , persons.size() - 1);
    }

}
