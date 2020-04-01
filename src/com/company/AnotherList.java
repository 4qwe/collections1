package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AnotherList {

    static ArrayList stringArray = ListContainer.createAL(promptWieviele());

    static int promptWieviele() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Wieviele Elemente bekommt die ArrayList?");
        return scanObj.nextInt();
    }

    static ArrayList<String> createAL(int i) {
        ArrayList<String> lisi = new ArrayList<>();
        while (i > 0) {
            lisi.add("a String");
            i--;
        }
        return lisi;
    }

}
