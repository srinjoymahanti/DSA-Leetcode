class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq=new int[100001];
        for(int ele:nums){
            freq[ele]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1) return i;
        }
        return -1;
    }
}