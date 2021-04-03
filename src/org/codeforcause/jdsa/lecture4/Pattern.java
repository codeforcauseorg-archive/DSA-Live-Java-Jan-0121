package org.codeforcause.jdsa.lecture4;

public class Pattern {
    public static void main(String[] args) {
        hollowRhombus(5);
    }

    private static void hollowRhombus(int n) {
        int i = 1, j = 1, row = 1, col = 1;
        while (i <= 2*n-1) {
            col = 1;
            while (col <= n-row) {
                System.out.print("  ");
                col++;
            }
            j = 1;
            while (j <= 2*row -1) {
                System.out.print("* ");
                j++;
            }
            if (i < n) {
                row++;
            } else {
                row--;
            }
            System.out.println();
            i++;
        }
    }
}
