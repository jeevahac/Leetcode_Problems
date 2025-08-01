// Last updated: 8/1/2025, 9:40:36 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row=0;
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){  // 0,4

            if(matrix[row][col]==target){
                return true;
                // return new int[] {row,col};
            }
            else if(matrix[row][col]<target){  // row is in decreasing order
                row++;
            }
            else{  // col is in icreasing order
                col--;
            }
        }
        return false;
    }
}