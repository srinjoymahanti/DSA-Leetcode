class Solution {
    public void swap(char[] s,int a,int b){
        char temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
    public void reverse(char[] s,int low,int high){
        if(low>=high) return;
        swap(s,low,high);
        low++;
        high--;
        reverse(s,low,high);
    }
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
}