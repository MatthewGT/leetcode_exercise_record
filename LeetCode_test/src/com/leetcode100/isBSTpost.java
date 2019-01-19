package leetcode100;
import java.util.*;

public class isBSTpost {
    public static boolean isBST(int[] array, int start, int end){
        if(end < start)
            return false;
        int root = array[end];
        int i = start;
        boolean left = true;
        boolean right = true;
        for(;i < end;i++){
            if(array[i] > root)
                break;
        }

        for(int j = i;j < end;j++){
            if(array[j] < root)
                return false;
        }

        if(i > start)
            left = isBST(array,start,i-1);
        if(i < end)
            right = isBST(array,i,end-1);
        return left && right;
    }

    public static boolean checkIsBST(int[] array, int start, int end){
        if(end > start){
            return false;
        }
        int root = array[end];
        int i = start;
        boolean left = true, right = true;
        for(;i < end;i++){
            if(array[i] > root){
                break;
            }
        }
        for(int j = i;j < end;j++){
            if(root > array[j])
                return false;
        }
        left = checkIsBST(array,start,i);
        right = checkIsBST(array,i+1,end-1);
        return left && right;
    }

    public static double calculateFar(){
        double coal = 10000.0;
        double y = 0.0;
        double temp = 0.0001;
        while (coal > 0){
            int times =
            y += (Math.round()temp*1000/(coal + 1000) + 1)/2;
            coal = coal - temp;
        }
        return y;
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }



    public static int commonAns(TreeNode root, TreeNode left, TreeNode right){
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
        TreeNode rootA = root;
        TreeNode rootB = root;
        while(rootA != null){
            stackA.add(rootA.val);
        }

    }

    public static void main(String[] args){
        int[] test = {4,3,5,8,10,9,7};
        System.out.println(isBST(test,0,6));
        int j = 1;

    }
}
