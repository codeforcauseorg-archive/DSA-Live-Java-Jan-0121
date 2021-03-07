package org.codeforcause.jdsa.lecture18;

public class TeacherCFC implements Teacher{
    @Override
    public void study() {
        System.out.println("Study like teacher");
    }

    @Override
    public void teach() {
        System.out.println("Teach like teacher");
    }
}
