package com.leetcode100;

import java.util.HashMap;

public class isLand_perimeter {
    public static int islandPerimeter(int[][] grid) {
        int sum = 0, m = grid.length, n = grid[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    sum = i-1<0?sum+1:sum;
                    sum = i+1>=m?sum+1:sum;
                    sum = j-1<0?sum+1:sum;
                    sum = j+1>=n?sum+1:sum;
                    if(i-1 >= 0 && grid[i-1][j] == 0)
                        sum += 1;
                    if(i+1 < n && grid[i+1][j] == 0)
                        sum += 1;
                    if(j+1 < m && grid[i][j+1] == 0)
                        sum += 1;
                    if(j-1 >= 0 && grid[i][j-1] == 0)
                        sum += 1;
                }

            }
        }
//        HashMap<Integer> map = new HashMap<>();
        return sum;

    }

    public static void main(String[] args){
        int[][] test = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(test));
    }
}
