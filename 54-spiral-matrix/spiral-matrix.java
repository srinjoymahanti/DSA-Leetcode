class Solution {
    public List<Integer> spiralOrder(int[][] arr) {       
        List<Integer> ans=new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        int minRow=0,maxRow=m-1,minCol=0,maxCol=n-1;
        while(minRow<=maxRow && minCol<=maxCol){
            //left to right
            for(int j=minCol;j<=maxCol;j++){
                ans.add(arr[minRow][j]);
            }
            minRow++;
            if(minRow>maxRow || minCol>maxCol) break;

            //top to bottom
            for(int i=minRow;i<=maxRow;i++){
                ans.add(arr[i][maxCol]);
            }
            maxCol--;
            if(minRow>maxRow || minCol>maxCol) break;

            //right to left
            for(int j=maxCol;j>=minCol;j--){
                ans.add(arr[maxRow][j]);
            }
            maxRow--;
            if(minRow>maxRow || minCol>maxCol) break;

            //bottom to top
            for(int i=maxRow;i>=minRow;i--){
                ans.add(arr[i][minCol]);
            }
            minCol++;
            if(minRow>maxRow || minCol>maxCol) break;
        }
        return ans;
    }
}