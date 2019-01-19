package leetcode100;

public class findUnique {
    public static int find(int[] arr){
        if(arr == null || arr.length == 0)
            return -1;
        int res = 0;
        for(int i: arr){
            res = res^i;
        }
        return res;
    }

    public static void main(String[] args){
        int[] test = {1,1,2,2,3,4,4};
        System.out.println(find(test));
    }
}
