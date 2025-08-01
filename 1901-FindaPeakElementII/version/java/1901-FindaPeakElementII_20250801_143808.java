// Last updated: 8/1/2025, 2:38:08 PM
class Solution {
    public static int findmaxindex(int mat[][], int n, int m,int col){

        int max_value=-1;
        int index=-1;

        for(int i=0;i<n;i++){
            if(mat[i][col]>max_value){
                max_value=mat[i][col];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        int low=0;
        int high=m-1;

        while(low<=high){
            int mid=(low+high)/2;
            int max_row_index=findmaxindex(mat,n,m,mid);

            int left=mid-1>=0? mat[max_row_index][mid-1]: -1;
            int right=m>mid+1 ? mat[max_row_index][mid+1]:-1;

            if(mat[max_row_index][mid]> left && mat[max_row_index][mid]>right){
                return new int []{max_row_index,mid};
            }
            else if(mat[max_row_index][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
        
    }
}