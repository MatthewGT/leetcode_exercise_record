package leetcode100;

public class BSTproblem {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }

    public TreeNode search(TreeNode root, int k){
        if(root == null || root.val == k)
            return root;
        else if(root.val < k)
            return search(root.right, k);
        else
            return search(root.left, k);
    }

    public TreeNode insert(TreeNode root, int k){
        if(root == null)
            return new TreeNode(k);
        if(root.val < k)
            root.right = insert(root.right, k);
        else if(root.val > k)
            root.left = insert(root.left, k);
        return root;
    }

    public TreeNode delete(TreeNode root, int k){
        if(root == null)
            return root;
        if(root.val < k){
            root.left = delete(root.left,k);
        }
        else if(root.val < k){
            root.right = delete(root.right, k);
        }
        else{
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            else {
                root.val = minVale(root);
                root.right = delete(root.right, root.val);
            }
        }
        return root;
    }

    public int  minVale(TreeNode root){
        while (root.left != null){
            root = root.left;
        }
        return root.val;
    }

    public TreeNode[] splitBST(TreeNode root, int V){
        if (root == null){
            return new TreeNode[]{null,null};
        }
        if(root.val <= V){
            TreeNode[] res = splitBST(root.right,V);
            root.right = res[0];
            res[0] = root;
            return res;
        }
        else {
            TreeNode[] res = splitBST(root.left, V);
            root.left = res[1];
            res[1] = root;
            return res;
        }
    }


}
