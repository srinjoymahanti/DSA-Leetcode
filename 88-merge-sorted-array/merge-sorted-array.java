class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]) nums1[k--]=nums1[i--];
            else nums1[k--]=nums2[j--];
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }

        // int[] arr=new int[m+n];
        // int i=0,j=0,k=0;
        // while(i<m && j<n){
        //     if(nums1[i]<nums2[j]) arr[k++]=nums1[i++];
        //     else arr[k++]=nums2[j++];
        // }
        // while(i<m){
        //     arr[k++]=nums1[i++];
        // }
        // while(j<n){
        //     arr[k++]=nums2[j++];
        // }
        // i=0;
        // for(int ele:arr){
        //     nums1[i++]=ele;
        // }



    }
}