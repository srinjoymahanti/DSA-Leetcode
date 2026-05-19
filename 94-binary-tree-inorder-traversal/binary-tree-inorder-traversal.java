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
        TreeNode temp=root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                if(st.isEmpty()) break;
                TreeNode top=st.pop();
                ans.add(top.val);
                temp=top.right;
            }
        }
        return ans;
    }    
}