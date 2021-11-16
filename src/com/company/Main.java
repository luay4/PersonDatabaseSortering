package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	sort1();

    sort2();
    }

    public static void sort1() {
        int[] tal = {6,2,8,1,9,21,0,3};

        System.out.println("Før sortering: " + Arrays.toString(tal));
        Arrays.sort(tal);
        System.out.println("Efter sortering: " + Arrays.toString(tal));
    }

    public static void sort2() {
        String[] ord = {"Bonde", "gård", "abe", "kat", "Hund", "ko", "and"};

        System.out.println("Før sortering: " + Arrays.toString(ord));
        Arrays.sort(ord);
        System.out.println("Efter sortering: " + Arrays.toString(ord));
    }
}
