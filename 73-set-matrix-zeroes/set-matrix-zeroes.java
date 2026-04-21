class Solution {
    public void setZeroes(int[][] arr) {
        int m=arr.length,n=arr[0].length;
        boolean zeroRow=false;
        boolean zeroCol=false;
        //traverse oth column
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                zeroCol=true;
                 break;
            }

        }
        //traverse oth row
        for(int j=0;j<n;j++){
            if(arr[0][j]==0){
                zeroRow=true;
                 break;
            }
        }
        //traverse without oth row and column
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++){//set the 0 marked rows to 0
            if(arr[i][0]==0){
                for(int j=1;j<n;j++){
                    arr[i][j]=0;
                }
            }
        }
        for(int j=1;j<n;j++){//set the 0 marked columns to 0
            if(arr[0][j]==0){
                for(int i=1;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }
        if(zeroRow==true){//set the 0th row to zero
            for(int j=0;j<n;j++){
                arr[0][j]=0;
            }
        }
        if(zeroCol==true){//set the 0th column to zero
            for(int i=0;i<m;i++){
                arr[i][0]=0;
            }
        }

    }
}