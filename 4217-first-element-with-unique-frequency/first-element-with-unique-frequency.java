class Solution {
    public int firstUniqueFreq(int[] nums) {
        int[] freq=new int[100001];
        for(int n:nums){
            freq[n]++;
        }
        int[] freqArr=new int[nums.length+1];
        for(int ele:freq){
            if(ele>0) freqArr[ele]++;
        }
        for(int ele:nums){
            if(freqArr[freq[ele]] == 1) return ele;
        }
        return -1;
    }
}