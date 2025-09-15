// Last updated: 9/15/2025, 9:02:27 AM
class Solution {
    public int[][] generateMatrix(int n) {

        int value=1;

        int [][]mat=new int[n][n];

        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;

        while( left<=right && top<=bottom ){

            for(int i=left;i<=right;i++){
                mat[top][i]=value++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                mat[i][right]=value++;
            }
            right--;

            //(at bottom)right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    mat[bottom][i]=value++;
                }
                bottom--;
            }
            

            //(at left) bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    mat[i][left]=value++;
                }
                left++;
            }

        }

        return mat;
        
    }
}