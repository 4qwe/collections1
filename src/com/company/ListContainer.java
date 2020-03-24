package com.company;

import java.util.HashMap;
import java.util.Scanner;

//Klasse, die alle Elemente und Methoden meiner ArrayList beinhaltet
public class ListContainer {

    public int anzahl_elemente = -1;
    public HashMap hashmapio = null;

    //
    public int promptWieviele() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Wieviele Elemente werden es denn?");
        return scanObj.nextInt();
    }

    public HashMap(int i) {
        HashMap<> lisi = new ArrayList<>();
        //der Loop befüllt das Array mit "a String" an jeder Stelle der Liste
        //"add" aus Java 'List' wird verwendet
        while (i > 0) {
            lisi.add("a String");
            i--;
        }
        return lisi;
    }

}
