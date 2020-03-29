package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // Beispielprojekt, dass HashSet in irgendeiner sinnvollen Weise verwendet

        SetContainer containero = new SetContainer();

        containero.hashsetio = containero.makeSet();

        System.out.println(containero.hashsetio.size());

        Iterator<Integer> iterator = containero.hashsetio.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.printf("Element hat gespeicherten Wert: %3d\n", i);
        }

        System.out.println("ENDE");


    }

}