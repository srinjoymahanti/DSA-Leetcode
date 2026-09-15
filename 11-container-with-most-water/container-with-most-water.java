class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int leftPt=0;
        int rightPt=n-1;
        int max=0;
        while(leftPt<rightPt){
            int area=Math.min(height[leftPt],height[rightPt])*(rightPt-leftPt);
            max=Math.max(area,max);
            if(height[leftPt]<height[rightPt]) leftPt++;
            else rightPt--;
        }
        return max;
    }
}