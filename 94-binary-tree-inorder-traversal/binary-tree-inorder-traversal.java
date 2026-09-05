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

    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> list=new ArrayList<>();
    //     helper(root,list);
    //     return list;
    // }
    // public void helper(TreeNode node,List<Integer> list){
    //     if(node==null) return;
    //     helper(node.left,list);
    //     list.add(node.val);
    //     helper(node.right,list);
    // }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            list.add(curr.val);
            curr=curr.right;
        }
        return list;
    }

    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> list=new ArrayList<>();
    //     TreeNode curr=root;
    //     while(curr!=null){
    //         if(curr.left!=null){
    //             TreeNode pred=curr.left;
    //             while(pred.right!=null && pred.right!=curr){
    //                 pred=pred.right;
    //             }
    //             if(pred.right==null){//linking
    //                 pred.right=curr;
    //                 curr=curr.left;
    //             }
    //             else{//unlinking
    //                 pred.right=null;
    //                 list.add(curr.val);
    //                 curr=curr.right;
    //             }
    //         }
    //         else{
    //             list.add(curr.val);
    //             curr=curr.right;
    //         }
    //     }
    //     return list;
    // }  
}