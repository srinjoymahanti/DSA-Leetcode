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
    private void nthLevel(TreeNode temp,List<List<Integer>> ans,int level){
        if(temp==null) return;
        if(level>=ans.size()){
           ans.add(new ArrayList<>());
        }
        ans.get(level).add(temp.val);
        nthLevel(temp.left,ans,level+1);
        nthLevel(temp.right,ans,level+1);

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        nthLevel(root,ans,0);
        return ans;
    }
}