package com.company;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        // Beispielprojekt dass eine static ArrayList erstellt, "this." nutzt und generic methods oder classes nutzt

        gruu();

        System.out.println("ENDE");
    }

    public static void gruu() {
        for (Object stringis : ListContainer.stringArray) { //generics for loop
            System.out.println(stringis);
        }

    }

}