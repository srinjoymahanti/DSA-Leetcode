class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int hi = n - 1, lo = 0;
        while (lo<=hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] <= nums[hi]) {//left sorted array
                if (nums[mid] < target && target <= nums[hi])
                    lo = mid + 1;//go to right side
                else
                    hi = mid - 1;//go to left side
            } else {//right sorted array
                if (nums[mid] > target && target >= nums[lo])
                    hi = mid - 1;//go to left side
                else
                    lo = mid + 1;//go to right side
            }
        }
        return -1;
    }
}