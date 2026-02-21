class Solution {
    public void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr=new ArrayList<Integer>();
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==i+1 || nums[i]==nums[nums[i]-1]) i++;
            else swap(nums,i,nums[i]-1);
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) arr.add(nums[i]);
        }
        Collections.sort(arr);
        return arr;
    }
}