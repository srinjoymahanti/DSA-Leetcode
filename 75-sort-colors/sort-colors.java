class Solution {
    public void swap(int[] arr,int a,int b) {
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
    public void sortColors(int[] arr){
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1) mid++;
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
}