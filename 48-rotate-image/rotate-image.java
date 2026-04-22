class Solution {
    public void swap(int[][] matrix,int a,int b){
        int temp=matrix[a][b];
        matrix[a][b]=matrix [b][a];
        matrix[b][a]=temp;
    }
    public void rotate(int[][] matrix) {
    int n=matrix.length;
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            swap(matrix,i,j);
        }
    }
    for(int i=0;i<n;i++){
        int a=0,b=n-1;
        while(a<b){
            int temp=matrix[i][a];
            matrix[i][a]=matrix[i][b];
            matrix[i][b]=temp;
            a++;
            b--;
        }
    } 
    }
}