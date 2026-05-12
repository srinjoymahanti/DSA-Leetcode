class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lp=0;
        int rp=n-1;
        int max=0;
        while(rp>lp){
            int area=Math.min(height[lp],height[rp])*(rp-lp);
            max=Math.max(area,max);
            if(height[lp]<height[rp]) lp++;
            else rp--;
        }
        return max;
    }
}