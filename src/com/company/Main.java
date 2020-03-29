package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // Beispielprojekt, dass HashSet in irgendeiner sinnvollen Weise verwendet

        SetContainer containero = new SetContainer();

        containero.hashsetioColl = containero.makeSet(); //ab hier haben wir die Collection hashsetio

        System.out.println(containero.hashsetioColl.size());

        Iterator iter = containero.hashsetioColl.iterator();
        while (iter.hasNext()) {
            int i = (int) iter.next(); /*nur in der Methode die das ursprüngliche HashSet erstellt wird
            generic verwendet. Collection und Iterator sind nicht generic*/
            System.out.printf("Element hat gespeicherten Wert: %3d\n", i);
        }

        System.out.println("ENDE");


    }

}