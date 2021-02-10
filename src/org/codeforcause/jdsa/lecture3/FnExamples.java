package org.codeforcause.jdsa.lecture3;

public class FnExamples {

    public static double interest(int p, int r, int t){
        double si = (p * r * t) / 100.0;
        return si;
    }

    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;

    }

    public static void main(String[] args) {
//        double response = interest(10000, 10, 1);
//        System.out.println(response);
        int x = 10;
        int y = 20;
        System.out.println(y + " " + x);
        swap(x, y);

    }
}
