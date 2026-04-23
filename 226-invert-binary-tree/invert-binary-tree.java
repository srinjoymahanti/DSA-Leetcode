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
    public void invert(TreeNode temp){
        if(temp==null) return;
        TreeNode helper=temp.left;
        temp.left=temp.right;
        temp.right=helper;
        invert(temp.left);
        invert(temp.right);
    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}