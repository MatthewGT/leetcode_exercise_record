package com.leetcode100;
import java.util.*;

public class subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;
        helper(res,nums,0,new ArrayList<>());
        return res;
    }

    private static void helper(List<List<Integer>> res,int[] nums,int index, List<Integer> list ){
        res.add(new ArrayList<>(list));
        for(int i = index; i < nums.length;i++){
            list.add(nums[i]);
            System.out.println(i+" "+list);
            helper(res,nums,i+1,list);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args){
        int[] test = {1,2,3};
        subsets(test);

    }

}
