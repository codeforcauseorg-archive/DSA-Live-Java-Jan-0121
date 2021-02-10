package org.codeforcause.jdsa.lecture5;

import static java.lang.Integer.reverse;

public class Reverse {
    public static void main(String[] args) {
        int num = 39526;
        // reverse -> 62593
        int res = reverseInt(num);
        System.out.println(res);
        int n = reverse(num);
    }

    public static int reverseInt(int n) {
        int res = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            res = res * 10 + rem;
        }
        return res;
    }
}
