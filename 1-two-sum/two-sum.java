class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     int n=nums.length;
    //     int[] arr=new int[2];
    //     for(int i=0;i<n-1;i++){
    //         if(nums[i]+nums[i+1]==target){
    //             arr[0]=i;
    //             arr[1]=i+1;
    //             break;
    //         }
    //     }
    //     return arr;
    // }


    public int[] twoSum(int[] nums, int target) {
        int[] ans={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            int val=i;
            int remaining=target-key;
            if(map.containsKey(remaining)){
                int idx=map.get(remaining);
                ans[0]=idx;ans[1]=i;
                break;
            }
            else map.put(key,val);
        }
        return ans;
    }
}