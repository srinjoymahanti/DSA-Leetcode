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
    static int maxDia;
    public int level(TreeNode temp){
        if(temp==null) return 0;
        int leftLevel=level(temp.left);
        int rightLevel=level(temp.right);
        int dia=leftLevel+rightLevel;
        maxDia=Math.max(maxDia,dia);
        return 1+Math.max(leftLevel,rightLevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia=0;
        level(root);
        return maxDia;
    }
}