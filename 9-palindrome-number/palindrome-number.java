class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0 || (x!=0 && x%10==0)) return false;
        // int rev=0;
        // while(x>rev){
        //     rev=rev*10+x%10;
        //     x=x/10;
        // }
        // return (rev==x || x==rev/10);

        if(x<0) return false;
        int original=x;
        int rev=0;
        while(x>0){
            rev=rev*10+x%10;
            x/=10;
        }
        return original==rev;
    }
}