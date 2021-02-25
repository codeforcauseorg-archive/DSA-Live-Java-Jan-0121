package org.codeforcause.jdsa.lecture15;

public class MazeBTLeet {

    public static void main(String[] args) {
        int[][] maze = {
                {0,6,0},
                {5,8,7},
                {0,9,0}
        };

        int max = 0;

        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[0].length; c++) {
                int res = mazePath(maze, r, c, 0);
                if(res > max){
                    max = res;
                }
            }
        }

        System.out.println(max);

    }

    private static int mazePath(int[][] maze, int cRow, int cCol, int total) {

        if(cRow < 0 || cCol < 0 || cRow >= maze.length || cCol >= maze[0].length){
            return total;
        }

        if(maze[cRow][cCol] == 0){
            return total;
        }

        int value = maze[cRow][cCol];

        maze[cRow][cCol] = 0;
        int top = mazePath(maze, cRow-1, cCol, total + value);
        int right = mazePath(maze, cRow, cCol+1, total + value);
        int bott = mazePath(maze, cRow+1, cCol, total + value);
        int left = mazePath(maze, cRow, cCol-1, total + value);
        maze[cRow][cCol] = value;

        return Math.max(Math.max(top, bott), Math.max(left, right));

    }
}
