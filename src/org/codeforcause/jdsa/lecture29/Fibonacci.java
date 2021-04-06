package org.codeforcause.jdsa.lecture29;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 15;
        Integer[] mem = new Integer[n+1];
        System.out.println(fibo(n));
        System.out.println(fiboDP(n, mem));
        System.out.println(fiboDPitr(n, mem));
    }

    private static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static int fiboDP(int n, Integer[] mem) {
        if (n < 2) {
            mem[n] = n;
            return n;
        }
        if (mem[n] != null) {
            return mem[n];
        }
        mem[n] = fiboDP(n-1, mem) + fiboDP(n-2, mem);
        return mem[n];
    }

    public static int fiboDPitr(int n, Integer[] mem) {
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                mem[i] = i;
            } else {
                mem[i] = mem[i-1] + mem[i-2];
            }
        }
        return mem[n];
    }
}
