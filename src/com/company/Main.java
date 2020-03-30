package com.company;

public class Main {

    public static void main(String[] args) {
        // Beispielprojekt dass ArrayList in irgendeiner sinnvollen Weise verwendet

        ListContainer containero = new ListContainer(); //das Objekt unserer Klasse heißt hardcoded "containero"

        containero.anzahl_elemente = containero.promptWieviele(); // erst die Variable im Objekt erstellen, sie wird dann mehrfach benutzt

        System.out.printf("Wir bauen also eine ArrayList mit %d Elementen%n", containero.anzahl_elemente);

        containero.listerio = containero.createAL(containero.anzahl_elemente);
        System.out.printf("Unser Array hat somit %s Stellen\n", containero.listerio.size());
        System.out.printf("Und zum Beispiel an 1. Stelle: '%s'\n", containero.listerio.get(0));

        for (String stringis : containero.listerio) { //generics for loop
            System.out.println(stringis);
        }

        System.out.println("ENDE");
    }

}