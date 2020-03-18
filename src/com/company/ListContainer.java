package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ListContainer {

    public int anzahl_elemente = -1;
    public ArrayList<String> listerio = null;

    public int promptWieviele() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Wieviele Elemente werden es denn?");
        return scanObj.nextInt();
    }

    public ArrayList<String> createAL(int i) {
        ArrayList<String> lisi = new ArrayList<>();
        while (i > 0) {
            lisi.add("a String");
            i--;
        }
        return lisi;
    }

}
