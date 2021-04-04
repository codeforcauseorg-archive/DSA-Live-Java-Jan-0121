package org.codeforcause.jdsa.lecture4;

public class HollowDiamondNumber {
    public static void main(String[] args) {
        int n = 4;
        int rowMirror = 0, row = 0;
        while (rowMirror < 2*n-1) {
            int col = 0, colMirror = 0;
            while (colMirror < 2*n-1) {
                if((col+row) < n) {
                    System.out.print((row + col + 1) + " ");
                } else {
                    System.out.print("  ");
                }
                if (colMirror < n-1) {
                    col++;
                } else {
                    col--;
                }
                colMirror++;
            }
            System.out.println();
            if(rowMirror < n-1){
                row++;
            }else {
                row--;
            }
            rowMirror++;
        }
    }
}
