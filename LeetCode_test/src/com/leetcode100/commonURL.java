//package com.leetcode100;
//import java.util.*;
//public class commonURL {
//    public static List<String> commonURL(String[] A1, String[] A2){
//        List<String> res = new ArrayList<>();
//        if(A1 == null || A1.length == 0 || A2 == null || A2.length == 0)
//            return res;
//        int m = A1.length,n = A2.length;
//        int max = Integer.MIN_VALUE, index = 0;
//        int[][] dp = new int[m+1][n+1];
//        for(int i = 0;i <= m;i++){
//            for(int j = 0;j <= n;j++){
//                if(i == 0 || j == 0)
//                    dp[i][j] = 0;
//                else if(A1[i-1] == A2[j-1]){
//                    dp[i][j] = dp[i-1][j-1] + 1;
//                    max = Math.max(dp[i][j],max);
//                    index = i;
//                }
//
//                else
//                    dp[i][j] = 0;
//            }
//        }
//        for(int i = index - max;i < index;i++){
//            res.add(A1[i]);
//        }
//        return res;
//    }
//
//    private void swap(int[] A, int i, int j){
//        int temp = A[i];
//        A[i] = A[j];
//        A[j] = temp;
//    }
//    public int[] sortArrayByParityII(int[] A) {
//        List<Integer> odd = new LinkedList<>();
//        List<Integer> even = new LinkedList<>();
//        for(int i = 0;i < A.length;i++){
//            if(i%2 == A[i]%2)
//                continue;
//            else if(i%2 == 1)
//                even.add(i);
//            else
//                odd.add(i);
//        }
//        while(even.size() != 0){
//            swap(A,even.)
//        }
//
//    }
//
//    private static String  printList(List<String> list){
//        String res = "";
//        for(int j = 0;j < list.size();j++){
//            res += " "+list.get(j);
//        }
//        return res;
//    }
//
//    public static void main(String[] args){
//        String[] A1 = { "/nine.html", "/four.html", "/six.html", "/seven.html", "/one.html"};
//        String[] A2 = {"/nine.html", "/two.html", "/three.html", "/four.html", "/six.html", "/seven.html"};
//        System.out.println(printList(commonURL(A1,A2)));
//    }
//}
