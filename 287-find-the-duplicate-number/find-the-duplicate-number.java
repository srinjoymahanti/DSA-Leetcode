class Solution {
    public void swap(int a,int b,int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public int findDuplicate(int[] nums) {
        // int[] freq=new int[100001];
        // for(int ele:nums){
        //     freq[ele]++;
        // }
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]>1) return i;
        // }
        // return -1;

        while(true){
            int ele=nums[0];
            if(ele==nums[ele]) return ele;
            swap(0,nums[0],nums);
        }
    }
}