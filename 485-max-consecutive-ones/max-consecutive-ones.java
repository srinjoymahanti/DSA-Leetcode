class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int noOf1=0;
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) noOf1++;
            else{
                max=Math.max(noOf1,max);
                noOf1=0;
            }
        }
        max=Math.max(noOf1,max);
        return max;
    }
}