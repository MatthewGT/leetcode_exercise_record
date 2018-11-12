package leetcode100;

import java.util.Stack;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int x){
        this.val = x;
    }
}

class treeInorderTravesal {
    public static void inorderTravesal(TreeNode root){
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if(!stack.isEmpty()){
                root = stack.pop();
                System.out.println(root.val);
                root = root.right;
            }
        }
    }

    public static void main(String[] args){
        TreeNode test = new TreeNode(1);
        test.left = new TreeNode(2);
        test.right = new TreeNode(3);
        inorderTravesal(test);
    }

}
