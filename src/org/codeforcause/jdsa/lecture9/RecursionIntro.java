package org.codeforcause.jdsa.lecture9;

public class RecursionIntro {
    public static void main(String[] args) {
//        print(5);
//        System.out.println(factorial(5));
        System.out.println(fibo(6));
    }

    private static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n-1);
    }
}
