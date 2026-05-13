class Solution {
    public void combSum(int[] arr,int idx,List<Integer> combi,List<List<Integer>> ans,int target){
        if(idx==arr.length || target<0) return;
        if(target==0) {
            ans.add(new ArrayList<>(combi));
            return;
        }
        combi.add(arr[idx]);
        // combSum(arr,idx+1,combi,ans,target-arr[idx]);//include single time
        combSum(arr,idx,combi,ans,target-arr[idx]);//include multiple times
        combi.remove(combi.size()-1);//excluded the element
        combSum(arr,idx+1,combi,ans,target);//exclude the element
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combi=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        combSum(candidates,0,combi,ans,target);
        return ans;
    }
}