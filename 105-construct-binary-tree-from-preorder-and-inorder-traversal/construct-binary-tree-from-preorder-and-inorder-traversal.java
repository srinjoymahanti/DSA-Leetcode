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
    public TreeNode helper(int[] preorder,int[] inorder,int preLo,int preHi,int inLo,int inHi){
        if(preLo>preHi && inLo>inHi) return null;
        TreeNode root=new TreeNode(preorder[preLo]);
        int r=0;
        while(inorder[r]!=preorder[preLo]) r++;
        int leftSize=r-inLo;//number of elements in the Left SubTree
        root.left=helper(preorder,inorder,preLo+1,preLo+leftSize,inLo,r-1);
        root.right=helper(preorder,inorder,preLo+leftSize+1,preHi,r+1,inHi);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return helper(preorder,inorder,0,n-1,0,n-1);
    }
}