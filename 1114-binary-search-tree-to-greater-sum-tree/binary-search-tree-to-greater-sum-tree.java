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
    public void inorder(TreeNode node,List<TreeNode> list){
        if(node==null) return;
        inorder(node.left,list);
        list.add(node);
        inorder(node.right,list);
    }
    public TreeNode bstToGst(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        inorder(root,list);
        for(int i=list.size()-2;i>=0;i--){
            list.get(i).val+=list.get(i+1).val;
        }
        return root;
    }
}