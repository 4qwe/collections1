package com.company;

import java.util.HashSet;

//Klasse, die alle Elemente und Methoden meines HashSet beinhaltet
public class SetContainer {

    public HashSet hashsetio = null;

    public HashSet makeSet() {
        HashSet<Integer> hashi = new HashSet<>(); //<> als Int *nur hier* spezifiziert, weil nur hier das Array mit Typen befüllt wird!

        for (int i = 0; i < 16; i++) hashi.add((int) (Math.random() * 100 + 1));
        return hashi;
    }

}
