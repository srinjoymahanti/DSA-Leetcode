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
    public TreeNode inorderPredessor(TreeNode root){
        TreeNode temp=root.left;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp;
    }
    public TreeNode inorderPredessorParent(TreeNode root,TreeNode pred){
        if(root.left==pred || root.right==pred) return root;
        TreeNode temp=root.left;
        while(temp.right!=pred){
            temp=temp.right;
        }
        return temp;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){//root will delete
            //case 1:0 child node
            if(root.left==null && root.right==null) return null;
            //case 2:1 child node
            else if(root.left==null || root.right==null){
                if(root.left==null) return root.right;
                else if(root.right==null) return root.left;
            }
            //case 3:2 child nodes
            else{
                TreeNode pred=inorderPredessor(root);
                TreeNode predParent=inorderPredessorParent(root,pred);
                if(predParent==root){
                    pred.right=root.right;
                    return pred;
                }
                predParent.right=pred.left;
                pred.left=root.left;pred.right=root.right;
                return pred;
            }
        }
        else if(key>root.val){//RST will change
            root.right=deleteNode(root.right,key);
        }
        else if(key<root.val){//LST will change
            root.left=deleteNode(root.left,key);
        }
        return root;
    }
}