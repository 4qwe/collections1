package com.company;

public class Main {

    public static void main(String[] args) {
        // Beispielprojekt, dass HashMap in irgendeiner sinnvollen Weise verwendet

        MapContainer containero = new MapContainer();

        containero.promptWieviele();

        containero.hashmapio = containero.makeMap();
        for (int i = 0; i < 16; i++) {
            System.out.printf("Element Nr. %2d: %s\n", (i + 1), (containero.hashmapio.get(i)));
        }
        System.out.println("ENDE");


    }

}