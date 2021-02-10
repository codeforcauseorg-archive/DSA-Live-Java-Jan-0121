package org.codeforcause.jdsa.lecture4;

public class PattBasic {

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

    public static void halfDia(int n){

        int rowmirr = 0;
        int row = 0;
        while (rowmirr < 2 * n - 1) {
            int col = 0;
            while (col < n - row) {
                System.out.print((row + col + 1) +" ");
                col++;
            }
            System.out.println();

            if(rowmirr < n-1){
                row++;
            }else {
                row--;
            }
            rowmirr++;
        }
    }



    public static void main(String[] args) {
        halfDia(10);
//        sep(4, 0);
//        sep(4, 1);
//        sep(4, 2);
//        sep(4, 3);
//        sep(4, 2);
//        sep(4, 1);
//        sep(4, 0);
//        int reps = 0;
//        while (reps < 10) {
//            int stars = 0;
//            while (stars < 5) {
//                System.out.print("*");
//                stars++;
//            }
//            System.out.println();
//
//            reps++;
//        }

    }
}
