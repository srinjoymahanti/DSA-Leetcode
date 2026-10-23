class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            int val=i;
            int remaining=target-key;
            if(map.containsKey(remaining)){
                int idx=map.get(remaining);
                ans[0]=idx;
                ans[1]=i;
                break;
            }
            else map.put(key,val);
        }
        return ans;
    }
}