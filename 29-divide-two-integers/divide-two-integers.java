class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1) return  Integer.MAX_VALUE;
        boolean negative =(dividend<0) ^ (divisor<0);
        long dvd=Math.abs((long)dividend);
        long dvs=Math.abs((long)divisor);
        int ans=0;
        while(dvd >=dvs){
            int count=0;
            while(dvd >= (dvs << (count+1))){
                count++;
            }
            ans+=(1<<count);
            dvd-=(dvs << count);
        }
        return negative?-ans:ans;
    }
}