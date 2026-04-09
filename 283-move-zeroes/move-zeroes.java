class Solution {
    public void moveZeroes(int[] arr) {
        // int n=arr.length;
        // int noz=0;
        // for(int ele:arr){
        //     if(ele==0) noz++;
        // }
        // for (int i = 0; i < noz; i++) {
        //     for (int j = 0; j < n-1; j++) {
        //         if(arr[j]==0){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}