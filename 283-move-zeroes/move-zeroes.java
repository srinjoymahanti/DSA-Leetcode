class Solution {
    public void moveZeroes(int[] nums) {
        int numOfZeros=0;
        for(int ele:nums){
            if(ele==0) numOfZeros++;
        }
        for(int i=1;i<=numOfZeros;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]==0){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}