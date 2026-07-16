class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        getPermute(nums,0);
        return ans;
    }
    public void getPermute(int[] nums,int idx){
        if(idx==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int ele:nums){
                list.add(ele);
            }
            ans.add(list);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            getPermute(nums,idx+1);
            swap(nums,idx,i);
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}