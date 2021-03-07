package org.codeforcause.jdsa.lecture18;

public class StudentCFC implements Student{
    @Override
    public void study() {
        System.out.println("Study like student");
    }

    @Override
    public void play() {
        System.out.println("Play like a student");
    }
}
