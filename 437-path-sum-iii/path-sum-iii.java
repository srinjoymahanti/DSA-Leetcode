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
    public int countPathSum(TreeNode root,long sum){
        if(root==null) return 0;
        int count=0;
        if(root.val==sum) count++;
        count+=countPathSum(root.left,sum-root.val)+countPathSum(root.right,sum-root.val);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        return countPathSum(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
}