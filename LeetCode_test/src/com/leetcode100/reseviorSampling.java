package com.leetcode100;

import java.util.Random;

public class reseviorSampling {
    public static int[] reseviorSampling(int[] arr, int k){
        int[] reservior = new int[k];
        for(int i = 0;i < k;i++){
            reservior[i] = arr[i];
        }
        Random r = new Random();
        for(int j = k;j < arr.length;j++){
            int temp = r.nextInt(j+1);
            if(temp < k)
                reservior[temp] = arr[j];
        }
        return reservior;
    }
    public static void main(String[] args){
        int[] test = {1,2,3,4};
        System.out.println(reseviorSampling(test,1)[0]);
    }


}
