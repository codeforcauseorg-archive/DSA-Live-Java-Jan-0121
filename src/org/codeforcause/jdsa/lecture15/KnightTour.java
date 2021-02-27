package org.codeforcause.jdsa.lecture15;

import java.util.Arrays;

public class KnightTour {
    public static void main(String[] args) {
        int[][] board = new int[5][5];
        for (int[] row : board) {
            Arrays.fill(row, -1);
        }
        int row = 0;
        int col = 0;
        tour(board, row, col, 0);
    }

    private static void tour(int[][] board, int row, int col, int step) {
        if(step == board.length*board.length){
            printBoard(board);
            return;
        }

        if(row < 0 || row >= board.length || col < 0 || col >= board.length){
            return;
        }

        if(board[row][col] != -1){
            return;
        }

        board[row][col] = step;
        tour(board, row+1, col+2, step+1);
        tour(board, row+2, col+1, step+1);
        tour(board, row+1, col-2, step+1);
        tour(board, row+2, col-1, step+1);
        tour(board, row-1, col+2, step+1);
        tour(board, row-2, col+1, step+1);
        tour(board, row-1, col-2, step+1);
        tour(board, row-2, col-1, step+1);
        board[row][col] = -1;
    }

    private static void printBoard(int[][] board) {
        for (int[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
