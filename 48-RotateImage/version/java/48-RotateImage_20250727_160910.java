// Last updated: 7/27/2025, 4:09:10 PM
class Solution {
    public void rotate(int[][] matrix) {
        
        int n=matrix.length;

        //transpose the matrix (no need to transpose)
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         int temp=matrix[i][j];
        //         matrix[i][j]=matrix[j][i];
        //         matrix[j][i]=temp;
        //     }
        // }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}