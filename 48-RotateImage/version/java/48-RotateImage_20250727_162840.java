// Last updated: 7/27/2025, 4:28:40 PM
class Solution {
    public void rotate(int[][] matrix) {
        
        int n=matrix.length;
        
        // tarnspose the matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        // for(int i=0;i<n;i++){
        //     int left=0;
        //     int right=n-1;
        //     while(left<right){
        //         int temp=matrix[i][left];
        //         matrix[i][left]=matrix[i][right];
        //         matrix[i][right]=temp;
        //         left++;
        //         right--;
        //     }
        // }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1]; //len here is n
                matrix[i][n-j-1]=temp;
            }
        }
    }
}