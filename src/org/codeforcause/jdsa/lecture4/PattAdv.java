package org.codeforcause.jdsa.lecture4;

public class PattAdv {

    public static void awayDownTri(int n){

        int rowmirr = 0;
        int row = 0;
        while (rowmirr < 2 * n - 1) {
            int colmirr = 0;
            int col = 0;
            while (colmirr < 2 * n - 1) {
                if((col+row) < n - 1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

                if(colmirr < n-1){
                    col++;
                }else {
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



    public static void main(String[] args) {
        awayDownTri(5);
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
