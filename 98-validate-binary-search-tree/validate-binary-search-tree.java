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
    // public boolean helper(TreeNode root,long min,long max){
    //     if(root==null) return true;
    //     if(root.val<=min || max<=root.val) return false;
    //     return helper(root.left,min,root.val)&& helper(root.right,root.val,max);
    // }
    // public boolean isValidBST(TreeNode root) {
    //     return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    // }


    public boolean isValidBST(TreeNode root) {
        TreeNode prev=null;
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred=curr.left;
                while(pred.right!=null && pred.right!=curr) pred=pred.right;
                if(pred.right==null){
                    pred.right=curr;
                    curr=curr.left;
                }
                else{
                    pred.right=null;
                    if(prev!=null && prev.val>=curr.val) return false;
                    prev=curr;
                    curr=curr.right;
                }
            }
            else{
                if(prev!=null && prev.val>=curr.val) return false;
                prev=curr;
                curr=curr.right;
            }
        }
        return true;
    }
}