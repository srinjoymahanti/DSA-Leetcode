class Solution {
    private void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // boolean[] mark=new boolean[n+1];
        // for(int ele:nums){
        //     mark[ele]=true;
        // }
        // for(int i=0;i<=n;i++){
        //     if(mark[i]==false) return i;
        // }
        // return -1;


        // int n=nums.length;
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=i) return i;
        // }
        // return n;


        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==i || nums[i]==n) i++;
            else swap(nums,i,nums[i]);
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i) return i;
        }
        return n;
    }
}