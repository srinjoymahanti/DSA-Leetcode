class Solution {
    public void combination(List<Integer> list,int idx,List<List<Integer>> ans){
        if(idx==list.size()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<list.size();i++){
            Collections.swap(list,idx,i);
            combination(list,idx+1,ans);
            Collections.swap(list,idx,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int ele:nums){
            list.add(ele);
        }
        combination(list,0,ans);
        return ans;
    }
}