package com.leetcode100;

import java.util.*;

public class permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;
        helper(nums, res, new ArrayList<>());
        return res;
    }

    private static void helper(int[] nums, List<List<Integer>> res,List<Integer> list){
        if(list.size() == nums.length)
            res.add(new ArrayList<>(list));
        else{
            for(int i = 0;i < nums.length;i++){
                if(list.contains(nums[i]))
                    continue;
                else{
                    list.add(nums[i]);
                    helper(nums,res,list);
                    list.remove(list.size()-1);
                }
            }
        }
    }

    public static void main(String[] args){
        int[] test = {1,2,3};
        List<List<Integer>> res = permute(test);
    }
}
