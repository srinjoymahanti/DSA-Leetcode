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
    public void path(List<String> ans,String s,TreeNode temp){
        if(temp==null) return;
        if(temp.left==null && temp.right==null){
            s+=temp.val;
            ans.add(s);
            return;
        }
        path(ans,s+temp.val+"->",temp.left);
        path(ans,s+temp.val+"->",temp.right);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        path(ans,"",root);
        return ans;
    }
}