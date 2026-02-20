class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // boolean[] arr=new boolean[n+1];
        // for(int ele:nums){
        //     arr[ele]=true;
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==false) return i;
        // }
        // return -1;

        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]!=i) return nums[i]-1;
        }
        return n;
    }
}