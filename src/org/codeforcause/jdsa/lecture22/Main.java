package org.codeforcause.jdsa.lecture22;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(12);
        list.insertLast(13);
        list.insertLast(15);

        list.insert(22,1);

        System.out.println(list);
        list.reverse();
        System.out.println(list);
    }
}
