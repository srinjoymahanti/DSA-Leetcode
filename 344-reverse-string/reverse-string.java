class Solution {
    public void swap(char[] s,int a,int b){
        char temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
    public void reverseString(char[] s) {
        int n=s.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            swap(s,low,high);
            low++;
            high--;
        }
    }
}