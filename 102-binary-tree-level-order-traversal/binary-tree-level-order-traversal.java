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
    public int levels(TreeNode temp){
        if(temp==null) return 0;
        return 1 + Math.max(levels(temp.left),levels(temp.right));
    }
    public void lvlOrder(List<Integer> arr,TreeNode temp,int currLvl,int finalLvl){
        if(temp==null) return;
        if(currLvl==finalLvl){
            arr.add(temp.val);
            return;
        }
        lvlOrder(arr,temp.left,currLvl+1,finalLvl);
        lvlOrder(arr,temp.right,currLvl+1,finalLvl);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int lvl=levels(root);
        for(int i=0;i<lvl;i++){
            List<Integer> arr=new ArrayList<>();
            lvlOrder(arr,root,0,i);
            ans.add(arr);
        }
        return ans;
    }
}