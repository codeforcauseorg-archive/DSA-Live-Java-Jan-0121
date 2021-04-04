package org.codeforcause.jdsa.lecture4;

public class NumberSquare {
    public static void main(String[] args) {
        int n = 3, row = n, col = 1, i = 0, j = 0;
        while (i < 2*n+1) {
            j = 0; col = n;
            while (j < 2*n+1) {
                System.out.print(Math.max(row, col) + " ");
                if (j < n) {
                    col--;
                } else {
                    col++;
                }
                j++;
            }
            System.out.println();
            if (i < n) {
                row--;
            } else {
                row++;
            }
            i++;
        }
    }
}
