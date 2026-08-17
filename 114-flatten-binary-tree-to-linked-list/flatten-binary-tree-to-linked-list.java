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
    // public void preorder(TreeNode root,List<TreeNode> list){
    //     if(root==null) return;
    //     list.add(root);
    //     preorder(root.left,list);
    //     preorder(root.right,list);
    // }
    // public void flatten(TreeNode root) {
    //     List<TreeNode> list=new ArrayList<>();
    //     preorder(root,list);
    //     int n=list.size();
    //     for(int i=0;i<n-1;i++){
    //         list.get(i).right=list.get(i+1);
    //         list.get(i).left=null;
    //     }
    // }


    public void flatten(TreeNode root) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        TreeNode lst=root.left;
        TreeNode rst=root.right;
        flatten(lst);
        flatten(rst);
        root.left=null;
        root.right=lst;
        TreeNode temp=root;
        while(temp.right!=null) temp=temp.right;
        temp.right=rst;
    }
}