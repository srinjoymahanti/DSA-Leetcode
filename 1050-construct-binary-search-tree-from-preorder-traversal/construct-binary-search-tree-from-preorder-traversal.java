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
    public TreeNode construct(int[] inorder,int[] preorder,int preLow,int preHigh,int inLow,int inHigh){
        if(preLow>preHigh || inLow>inHigh) return null;
        TreeNode node=new TreeNode(preorder[preLow]);
        int r=0;
        while(inorder[r]!=preorder[preLow]) r++;
        int leftSize=r-inLow;
        node.left=construct(inorder,preorder,preLow+1,preLow+leftSize,inLow,r-1);
        node.right=construct(inorder,preorder,preLow+leftSize+1,preHigh,r+1,inHigh);
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int n=preorder.length;
        int[] inorder=Arrays.copyOf(preorder,n);
        Arrays.sort(inorder);
        return construct(inorder,preorder,0,n-1,0,n-1);
    }
}