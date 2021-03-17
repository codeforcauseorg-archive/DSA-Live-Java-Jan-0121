package org.codeforcause.jdsa.lecture23;

import org.codeforcause.jdsa.lecture18.Car;

public class Main {
    public static void main(String[] args) {
        GenericLinkedList<String> list1 = new GenericLinkedList<>();
        list1.insertLast("Ankita");
        list1.insertLast("Ekta");
        list1.insertLast("Neha");
        list1.insertLast("Shubham");

        GenericLinkedList<String> list2 = new GenericLinkedList<>();
        list2.insertLast("Meenal");
        list2.insertLast("Vedika");
        list2.insertLast("Yukti");

        GenericLinkedList<String> list = list1.merge(list2);
        System.out.println(list);
    }
}
