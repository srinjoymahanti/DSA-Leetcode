class Solution {
    public int squareSum(int num){
        int sum=0;
        while(num!=0){
            sum+=(num%10)*(num%10);
            num=num/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        while(true){
            fast=squareSum(squareSum(fast));
        slow=squareSum(slow);
        if(fast==1) return true;
        if(fast==slow) return false;
        }
    }
}