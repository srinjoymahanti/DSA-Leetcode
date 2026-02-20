class Solution {
    public void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==i+1 || nums[i]<=0 || nums[i]>n || nums[i]==nums[nums[i]-1]) i++;
            else swap(nums,i,nums[i]-1);
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return i+1;
    }
}