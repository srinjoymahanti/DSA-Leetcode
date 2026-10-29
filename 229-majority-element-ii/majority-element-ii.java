class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int count1=0,count2=0;
        int candidate1=nums[0],candidate2=nums[0];
        for(int ele:nums){
            if(ele==candidate1) count1++;
            else if(ele==candidate2) count2++;
            else if(count1==0){
                candidate1=ele;
                count1=1;
            }
            else if(count2==0){
                candidate2=ele;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
        for(int ele:nums){
            if(ele==candidate1) count1++;
            else if(ele==candidate2) count2++;
        }
        List<Integer> list=new ArrayList<>();
        if(count1>n/3) list.add(candidate1);
        if(count2>n/3) list.add(candidate2);
        return list;
    }
}