class Solution {
    long mod=1000000007;
    private long power(long x,long n){
        if(n==0) return 1;
        long half=power(x,n/2);
        if(n%2==0) return (half*half)%mod;
        else return (half*half*x)%mod;
    }
    public int countGoodNumbers(long n) {
        long evenIdxs=(n+1)/2;
        long oddIdxs=n/2;
        long ans=(power(5,evenIdxs)*power(4,oddIdxs))%mod;
        return (int)ans;
    }
}