class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int ele:nums){
            if(ele<0) neg.add(ele);
            else pos.add(ele);
        }
        int i=0,j=0;
        for(int k=0;k<n;k++){
            if(k%2==0) nums[k]=pos.get(i++);
            else nums[k]=neg.get(j++);
        }
        return nums;
    }
}