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

    // public void helper(TreeNode temp,List<Integer> arr){
    //     if(temp==null) return;
    //     arr.add(temp.val);
    //     helper(temp.left,arr);
    //     helper(temp.right,arr);
    // }
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> ans=new ArrayList<>();
    //     helper(root,ans);
    //     return ans;
    // }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode top=st.pop();
            ans.add(top.val);
            if(top.right!=null) st.push(top.right);
            if(top.left!=null) st.push(top.left);
        }
        return ans;
    }
}