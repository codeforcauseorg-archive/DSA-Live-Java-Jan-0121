package org.codeforcause.jdsa.lecture10;

public class PatternRecursion {
    public static void main(String[] args) {
        int row = 5, col = 0;
        printStar(row, col);
        printStar2(row,col);
    }

    private static void printStar(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row == col){
            System.out.println();
            printStar(row-1, 0);
            return;
        }
        System.out.print("*");
        printStar(row, col+1);
    }

    private static void printStar2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row == col){
            printStar2(row-1, 0);
            System.out.println();
            return;
        }
        printStar2(row, col+1);
        System.out.print("*");
    }
}
