package leetcode100;

import java.util.HashMap;
import java.util.LinkedList;

public class degreeOfArray {
    public static int findShortestSubArray(int[] nums) {
        if(nums.length == 0)
            return 0;
        HashMap<Integer,Integer> fre = new HashMap<>();
        HashMap<Integer,LinkedList<Integer>> rec = new HashMap<>();
        int degree = 0;
        LinkedList<Integer> aim = new LinkedList<>();
        for(int i:nums){
            fre.put(i,fre.getOrDefault(i,0)+1);
            degree = Math.max(degree,fre.get(i));
        }
        for(int i:fre.keySet()){
            if(!rec.keySet().contains(fre.get(i))){
                LinkedList<Integer> temp = new LinkedList<>();
                temp.add(i);
                rec.put(fre.get(i),temp);
            }
            else{
                rec.get(fre.get(i)).add(i);
            }
        }
        aim = rec.get(degree);
        int res = Integer.MAX_VALUE;
        for(int i:aim){

            res = Math.min(res,findLength(nums,i,degree));
        }
        return res;
    }

    public static int findLength(int[] nums, int target,int degree){
        int start = 0,end = 0, count = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target){
                count++;
                if(count == 1){
                    start = i;
                }
                if(count == degree){
                    end = i;
                }
            }

        }
        System.out.println(start + " " + end + " " );
        return end - start + 1;
    }


    public static void main(String[] args){
        int[] test ={1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(test));
    }
}
