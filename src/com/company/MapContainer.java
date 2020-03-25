package com.company;

import java.util.HashMap;

//Klasse, die alle Elemente und Methoden meiner ArrayList beinhaltet
public class MapContainer {

    public HashMap hashmapio = null;

    public void promptWieviele() {
        System.out.println("Unsere HashMap hat 16 Elemente (Default)\n");
    }

    public HashMap makeMap() {
        HashMap hashi = new HashMap(); //HashMap() default construktor macht eine mit 16 Elementen (Kapazität=16)

        for (int i = 0; i < 16; i++) {
            hashi.put(i, "Wert ist dieser hier String");
        }
        return hashi;
    }

}
