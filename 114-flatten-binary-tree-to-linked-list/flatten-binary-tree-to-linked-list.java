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
    public void preorder(TreeNode root,List<TreeNode> list){
        if(root==null) return;
        list.add(root);
        preorder(root.left,list);
        preorder(root.right,list);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        preorder(root,list);
        int n=list.size();
        for(int i=0;i<n-1;i++){
            list.get(i).right=list.get(i+1);
            list.get(i).left=null;
        }
    }
}