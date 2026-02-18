class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int ele=nums[nums.length-k];
        return ele;
    }
}