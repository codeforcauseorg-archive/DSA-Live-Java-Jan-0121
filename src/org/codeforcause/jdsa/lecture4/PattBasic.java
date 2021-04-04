package org.codeforcause.jdsa.lecture4;

public class PattBasic {
    public static void main(String[] args) {
        upTriangle(5);
    }
    public static void square(int n){
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < n) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void upTriangle(int n){
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void downTriangle(int n){
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < n - row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void sep(int n, int row){
        int col = 0;
        while (col < n - row) {
            System.out.print("* ");
            col++;
        }
        System.out.println();
    }
}
