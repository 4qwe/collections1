package com.company;

public class Main {

    public static void main(String[] args) {
        // Beispielprojekt, dass ArrayList in irgendeiner sinnvollen Weise verwendet

        ListContainer containero = new ListContainer(); /*das Objekt unserer Klasse heißt hardcoded "containero" -
        Variablen-Namen in main können als hardcoded betrachtet werden (?), weil main wird niemals instantiiert werden*/

        containero.anzahl_elemente = containero.promptWieviele(); // erst die Variable im Objekt erstellen, sie wird dann mehrfach benutzt

        System.out.printf("Wir bauen also eine ArrayList mit %d Elementen%n", containero.anzahl_elemente);
        containero.listerio = containero.createAL(containero.anzahl_elemente);

        System.out.printf("Unser Array hat somit %s Stellen\n", containero.listerio.size());
        System.out.printf("Und zum Beispiel an 16. Stelle: '%s'\n", containero.listerio.get(15));

        System.out.println("ENDE");

    }

}