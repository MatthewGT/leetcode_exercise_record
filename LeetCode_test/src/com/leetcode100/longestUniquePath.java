package leetcode100;

public class longestUniquePath {
    private static int result;
    public static int longestUnivaluePath(TreeNode root) {
        if(root == null)
            return 0;
        result = 0;
        helper(root);
        return result;
    }

    private static int helper(TreeNode root){
        if(root == null)
            return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int pl = 0;
        int pr = 0;
        if(root.left != null && root.val == root.left.val)
            pl = left + 1;
        if(root.right != null && root.val == root.right.val)
            pr = right + 1;
        result = Math.max(result, pl+pr);
        return Math.max(pl,pr);

    }

    public static void main(String[] args){
        TreeNode test = new TreeNode(1);
        test.left = new TreeNode(1);
        test.right = new TreeNode(1);
        System.out.println(longestUnivaluePath(test));
    }
}
