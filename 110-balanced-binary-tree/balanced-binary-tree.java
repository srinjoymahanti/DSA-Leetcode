/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean ans;
    private int dfs(TreeNode root){
        if(root==null) return 0;
        int leftLevels=dfs(root.left);
        int rightLevels=dfs(root.right);
        if(Math.abs(leftLevels-rightLevels) > 1) ans=false;
        return 1+Math.max(leftLevels,rightLevels);
    }
    public boolean isBalanced(TreeNode root) {
        ans=true;
        dfs(root);
        return ans;
    }
}