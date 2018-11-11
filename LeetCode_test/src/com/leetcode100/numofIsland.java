//package com.leetcode100;
//
//public class numofIsland {
//    public static int numIslands(char[][] grid) {
//        int sum = 0, m = grid.length,n = grid[0].length;
//        for(int i = 0;i < m;i++){
//            for(int j = 0;j < n;j++){
//                if(grid[i][j] == 1){
//                    sum += 1;
//                    if(i-1 < 0 || i+1 > m || j-1 < 0 || j+1 > n)
//                        continue;
//                    if(grid[i-1][j] == '1' || grid[i+1][j] == '1' || grid[i][j-1] == '1' || grid[i][j+1] == '1')
//                        sum -= 1;
//
//                }
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args){
//        int[]
//    }
//}
