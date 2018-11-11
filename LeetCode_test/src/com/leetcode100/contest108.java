//package com.leetcode100;
//import java.util.*;
//public class contest108 {
//    public static int numUniqueEmails(String[] emails) {
//        if(emails == null || emails.length == 0)
//            return 0;
//        Set<String> set = new HashSet<>();
//        for(String ite:emails){
//            String[] A = ite.split("@");
//            System.out.println(A[0].split("\\+")[0]);
//            if(A[0].indexOf("+") != -1)
//                A[0] = A[0].split("\\+")[0];
//            System.out.println(A[0].indexOf("."));
//            if(A[0].indexOf(".") != -1)
//                A[0] = A[0].replaceAll("\\.","");
//            set.add(A[0]+A[1]);
//        }
//        return set.size();
//    }
//
//    public int numSubarraysWithSum(int[] A, int S) {
//        Collections.sort(A);
//
//    }
//
//    public static void main(String[] args){
//        String[] test = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
//        System.out.println(numUniqueEmails(test));
//    }
//}
