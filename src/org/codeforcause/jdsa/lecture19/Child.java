package org.codeforcause.jdsa.lecture19;

public class Child extends Parent{
    int age;
    String name;
    String friend = "chintu";

    Child(int age, String name) {
        super(age*20, name+" papa");
        this.age = age;
        this.name = name;
    }

    @Override
    void scold() {
        System.out.println("Bahut daant padi");
    }

    void play() {
        System.out.println("Kheloooo");
    }
}
