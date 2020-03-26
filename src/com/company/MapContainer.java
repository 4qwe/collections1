package com.company;

import java.util.HashMap;

//Klasse, die alle Elemente und Methoden meiner ArrayList beinhaltet
public class MapContainer {

    public HashMap hashmapio = null;

    public void promptWieviele() {
        System.out.println("Unsere HashMap hat 16 Elemente (Default)\n");
    }

    public HashMap makeMap() {
        HashMap<Integer, String> hashi = new HashMap<>(); //eckige Klammern beim Konstruktor können leer bleiben, weil
        // erwartete Typen bei der Deklaration links festgelegt wurden

        for (int i = 0; i < 16; i++) {
            hashi.put(i, "Wert ist dieser hier String");
        }
        return hashi;
    }

}
