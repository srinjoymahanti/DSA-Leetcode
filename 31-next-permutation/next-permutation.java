class Solution {
    public void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void reverse(int[] arr,int left,int right){
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j=n-1;
            while(j>=0 && nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        
        reverse(nums,i+1,n-1);
    }
}