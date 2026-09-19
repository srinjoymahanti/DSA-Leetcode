class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int[] ans=new int[2];
        int firstIdx=-1,lastIdx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                if(mid>0 && nums[mid-1]==nums[mid]) high=mid-1;
                else{
                    firstIdx=mid;
                    break;
                }
            }
            else if(nums[mid]>target) high=mid-1;
            else if(nums[mid]<target) low=mid+1;
        }
        high=n-1;low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                if(mid<n-1 && nums[mid]==nums[mid+1]) low=mid+1;
                else{
                    lastIdx=mid;
                    break;
                }
            }
            else if(nums[mid]>target) high=mid-1;
            else if(nums[mid]<target) low=mid+1;
        }
        ans[0]=firstIdx;
        ans[1]=lastIdx;
        return ans;
    }
}