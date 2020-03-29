package com.company;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

//Klasse, die alle Elemente und Methoden meines HashSet beinhaltet
public class SetContainer {

    public Collection hashsetioColl;

    public HashSet makeSet() {
        HashSet<Integer> hashi = new HashSet<>();

        for (int i = 0; i < 16; i++) hashi.add(i);
        return hashi;
    }

}
