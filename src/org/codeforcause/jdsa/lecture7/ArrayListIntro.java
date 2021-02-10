package org.codeforcause.jdsa.lecture7;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(23);
        list.add(45);
        System.out.println(list);
        list.add(1,12);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
