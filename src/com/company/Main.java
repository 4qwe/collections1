package com.company;

public class Main {

    public static void main(String[] args) {
        // Beispielprojekt dass ArrayList in irgendeiner sinnvollen Weise verwendet

        ListContainer Containero = new ListContainer(); //das Objekt unserer Klasse heißt hardcoded "Containero"

        Containero.anzahl_elemente = Containero.promptWieviele(); // erst die Variable im Objekt erstellen, sie wird dann mehrfach benutzt

        System.out.printf("Wir bauen also eine ArrayList mit %d Elementen%n", Containero.anzahl_elemente);

        Containero.listerio = Containero.createAL(Containero.anzahl_elemente);
        System.out.printf("Unser Array hat somit %s Stellen\n", Containero.listerio.size());
        System.out.printf("Und zum Beispiel an 1. Stelle: '%s'\n", Containero.listerio.get(0));

        System.out.println("ENDE");

    }

}