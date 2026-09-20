class Solution {
    public void combiSum(int[] arr,List<Integer> list,List<List<Integer>> ans,int idx,int target){
        if(idx==arr.length || target<0) return;
        if(target==0){
            ans.add(new ArrayList(list));
            return;
        }
        list.add(arr[idx]);
        combiSum(arr,list,ans,idx,target-arr[idx]);

        list.remove(list.size()-1);
        combiSum(arr,list,ans,idx+1,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        combiSum(candidates,list,ans,0,target);
        return ans;
    }
}