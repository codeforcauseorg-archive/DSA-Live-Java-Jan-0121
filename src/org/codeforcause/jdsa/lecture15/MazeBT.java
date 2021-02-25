package org.codeforcause.jdsa.lecture15;

public class MazeBT {

    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int[][] maze = new int[m][n];

        int cRow = 1;
        int cCol = 2;

        int fRow = 2;
        int fCol = 0;

        int[][] bombs = {{0, 0},
                {2, 2}};

        for (int[] bombPos : bombs) {
            int row = bombPos[0];
            int col = bombPos[1];
            maze[row][col] = 1;
        }

        mazePath(maze, cRow, cCol, fRow, fCol, "");

    }

    private static void mazePath(int[][] maze, int cRow, int cCol, int fRow, int fCol, String solution) {

        if(cRow < 0 || cCol < 0 || cRow >= maze.length || cCol >= maze[0].length){
            return;
        }

        if(maze[cRow][cCol] == 1){
            return;
        }

        if(cRow == fRow && cCol == fCol){
            System.out.println(solution);
            return;
        }

        maze[cRow][cCol] = 1;
        mazePath(maze, cRow-1, cCol, fRow, fCol, solution+"N");
//        maze[cRow][cCol] = 0;
//
//        maze[cRow][cCol] = 1;
        mazePath(maze, cRow, cCol+1, fRow, fCol, solution+"E");
//        maze[cRow][cCol] = 0;
//
//        maze[cRow][cCol] = 1;
        mazePath(maze, cRow+1, cCol, fRow, fCol, solution+"S");
//        maze[cRow][cCol] = 0;
//
//        maze[cRow][cCol] = 1;
        mazePath(maze, cRow, cCol-1, fRow, fCol, solution+"W");
        maze[cRow][cCol] = 0;

    }
}
