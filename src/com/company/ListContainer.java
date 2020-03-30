package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ListContainer {

    public int anzahl_elemente = -1;
    ArrayList<String> listerio = null; //package-private, nur so

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

    public void set_this_listerio(ArrayList<String> listi) {
        this.listerio = listi;
    }
}
