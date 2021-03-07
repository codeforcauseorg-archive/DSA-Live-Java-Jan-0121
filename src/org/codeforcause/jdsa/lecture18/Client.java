package org.codeforcause.jdsa.lecture18;

public class Client {
    static int num = 10;
    public static void main(String[] args) {
        System.out.println(sum());
    }

    //Method Overloading
    public static int sum() {
        return num + 100;
    }

    public static int sum(int a) {
        return num + a;
    }

    public static double sum(double a) {
        return num + a;
    }
}
