class Solution {
    private void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==i+1 || nums[i]<=0 || nums[i]>=n || nums[i]==nums[nums[i]-1]) i++;
            else swap(nums,i,nums[i]-1);
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return i+1;
    }
}