package com.company;

public class Main {

    public static void main(String[] args) {
        // Beispielprojekt, dass ArrayList in irgendeiner sinnvollen Weise verwendet

        MapContainer containero = new MapContainer(); /*das Objekt unserer Klasse heißt hardcoded "containero" -
        Variablen-Namen in main können als hardcoded betrachtet werden (?), weil main wird niemals instantiiert werden*/

        containero.promptWieviele();

        containero.hashmapio = containero.makeMap();

        System.out.printf("Und zum Beispiel für den Key '15': '%s'\n", containero.hashmapio.get(15));

        System.out.println("ENDE");

    }

}