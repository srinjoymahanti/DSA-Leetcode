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
    //     helper(temp.left,arr);
    //     arr.add(temp.val);
    //     helper(temp.right,arr);
    // }
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> ans=new ArrayList<>();
    //     helper(root,ans);
    //     return ans;
    // }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        return ans;
    }    
}