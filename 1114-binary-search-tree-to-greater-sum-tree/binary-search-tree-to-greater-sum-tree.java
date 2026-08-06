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
    int sum;
    public void reverseInorderSum(TreeNode node){
        if(node == null) return;
        reverseInorderSum(node.right);
        node.val+=sum;
        sum=node.val;
        reverseInorderSum(node.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum=0;
        reverseInorderSum(root);
        return root;
    }
}