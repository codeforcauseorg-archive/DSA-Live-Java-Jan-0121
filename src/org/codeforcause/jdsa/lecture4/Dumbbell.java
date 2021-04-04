package org.codeforcause.jdsa.lecture4;

public class Dumbbell {
    public static void main(String[] args) {
        dumb(5);
    }
    public static void dumb(int n){
        int rowmirr = 0;
        int row = 0;
        while (rowmirr < 2 * n - 1) {
            int colmirr = 0;
            int col = 0;
            while (colmirr < 6 * n - 3) {
                if(((row + col) < n - 1) || ((col > 2 * n - 2) && (row < n/2))){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                if(colmirr < 3 * n - 2){
                    col++;
                } else {
                    col--;
                }
                colmirr++;
            }
            System.out.println();
            if(rowmirr < n-1){
                row++;
            } else {
                row--;
            }
            rowmirr++;
        }
    }

}
