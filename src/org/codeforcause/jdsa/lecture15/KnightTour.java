package org.codeforcause.jdsa.lecture15;

import java.util.Arrays;

public class KnightTour {

    public static void main(String[] args) {
        int[][] board = new int[8][8];

        for (int[] row : board) {
            Arrays.fill(row, -1);
        }

        int row = 0;
        int col = 0;

        tour(board, row, col, 0);
    }

    private static void tour(int[][] board, int row, int col, int step) {

        if(step == 64){
            for (int[] rowboard : board) {
                System.out.println(Arrays.toString(rowboard));
            }
            return;
        }

        if(row < 0 || row >= 8 || col < 0 || col >= 8){
            return;
        }

        if(board[row][col] >= 0){
            return;
        }

        board[row][col] = step;

        tour(board, row+1, col+2, step+1);
        tour(board, row+2, col+1, step+1);
        tour(board, row-1, col+2, step+1);
        tour(board, row-2, col+1, step+1);
        tour(board, row+1, col-2, step+1);
        tour(board, row+2, col-1, step+1);
        tour(board, row-1, col-2, step+1);
        tour(board, row-2, col-1, step+1);

        board[row][col] = -1;
    }
}
