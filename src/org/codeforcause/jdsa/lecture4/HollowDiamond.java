package org.codeforcause.jdsa.lecture4;

public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5;
        int i = 0, j, row = 0, col;
        while (i < 2*n - 1) {
            col = 0;
            j = 0;
            while (j < 2*n - 1) {
                if ((col+row) < n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                if (j < n-1) {
                    col++;
                } else {
                    col--;
                }
                j++;
            }
            System.out.println();
            if (i < n-1) {
                row++;
            } else {
                row--;
            }
            i++;
        }
    }
}