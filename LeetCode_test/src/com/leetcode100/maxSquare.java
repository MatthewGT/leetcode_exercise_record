package leetcode100;

import matthew.Main;

public class maxSquare {
    public static int findMaxSqure(int[][] arr){
        if(arr == null || arr.length == 0 || arr[0].length == 0)
            return 0;
        int m = arr.length;
        int n = arr[0].length;
        int res = 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0;j < n;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = arr[i][j];
                    res = Math.max(dp[i][j],res);
                    continue;
                }
                if(arr[i][j] > 0){
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                    res = Math.max(dp[i][j],res);
                }
                else {
                    dp[i][j] = arr[i][j];
                }

            }

        }
        return res;
    }


    public static void main(String[] args){
    }
}
