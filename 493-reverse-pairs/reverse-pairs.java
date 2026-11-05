class Solution {
    static int count=0;
    public int reversePairs(int[] nums) {
        count=0;
        mergeSort(nums);
        return count;
    }
    public void merge(int[] a,int[] b,int[] arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];
    }
    public void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for(int i=0;i<a.length;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        inversions(a,b);
        merge(a,b,arr);
    }
    public int inversions(int[] a,int[] b){
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if((long) a[i] > (long)2 * (long)b[j]){
                count+=a.length-i;
                j++;
            } 
            else i++;
        }
        return count;
    }
}