class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean[] mark=new boolean[n+1];
        for(int ele:nums){
            mark[ele]=true;
        }
        for(int i=0;i<=n;i++){
            if(mark[i]==false) return i;
        }
        return -1;
    }
}