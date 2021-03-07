package org.codeforcause.jdsa.lecture19;

public class Parent {
    int age;
    String name;

    Parent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void scold() {
        System.out.println("Papa ne daanta");
    }

    void earn() {
        System.out.println("Salary");
    }
}
