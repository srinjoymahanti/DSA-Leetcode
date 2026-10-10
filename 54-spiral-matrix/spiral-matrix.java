class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int minRow=0,maxRow=n-1,minCol=0,maxCol=m-1;
        while(minRow<=maxRow && minCol<=maxCol){
            //left to right
            for(int j=minCol;j<=maxCol;j++){
                list.add(matrix[minRow][j]);
            }
            if(minRow>maxRow || minCol>maxCol) break;
            minRow++;
            //up to down
            for(int i=minRow;i<=maxRow;i++){
                list.add(matrix[i][maxCol]);
            }
            if(minRow>maxRow || minCol>maxCol) break;
            maxCol--;
            //right to left
            for(int j=maxCol;j>=minCol;j--){
                list.add(matrix[maxRow][j]);
            }
            if(minRow>maxRow || minCol>maxCol) break;
            maxRow--;
            //down to up
            for(int i=maxRow;i>=minRow;i--){
                list.add(matrix[i][minCol]);
            }
            if(minRow>maxRow || minCol>maxCol) break;
            minCol++;
        }
        return list;
    }
}