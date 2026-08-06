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
    public void inorder(TreeNode node,List<Integer> list){
        if(node==null) return;
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
    public TreeNode convertToBST(List<Integer> list,int low,int high){
        if(low>high) return null;
        int mid=low+(high-low)/2;
        TreeNode node =new TreeNode(list.get(mid));
        node.left=convertToBST(list,low,mid-1);
        node.right=convertToBST(list,mid+1,high);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        return convertToBST(list,0,list.size()-1);
    }
}