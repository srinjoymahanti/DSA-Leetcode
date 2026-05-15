class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        int hi=n-1,lo=0;
        int firstIdx=-1,lastIdx=-1;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                if(mid>0 && nums[mid-1]==nums[mid]) hi=mid-1;
                else{
                    firstIdx=mid;
                    break;
                }
            }
            else if(nums[mid]<target) lo=mid+1;
            else if(nums[mid]>target) hi=mid-1;
        }
        hi=n-1;lo=0;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                if(mid<n-1 && nums[mid]==nums[mid+1]) lo=mid+1;
                else{
                    lastIdx=mid;
                    break;
                }
            }
            else if(nums[mid]<target) lo=mid+1;
            else if(nums[mid]>target) hi=mid-1;
        }
        ans[0]=firstIdx;
        ans[1]=lastIdx;
        return ans;
    }
}