class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int lo=0,hi=n-1;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<=arr[hi]){// in right sorted array
                if(arr[mid]<target && target<=arr[hi]) lo=mid+1;
                else hi=mid-1;
            }
            else{//in left sorted array
                if(arr[lo]<=target && target<arr[mid]) hi=mid-1;
                else lo=mid+1;
            }
        }
        return -1;
    }
}