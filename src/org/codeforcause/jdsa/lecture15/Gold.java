package org.codeforcause.jdsa.lecture15;

// https://leetcode.com/problems/path-with-maximum-gold/

public class Gold {
    public int getMaximumGold(int[][] grid) {
        int max = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                int res = mazePath(grid, r, c, 0);
                if(res > max){
                    max = res;
                }
            }
        }
        return max;
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