// Last updated: 7/27/2025, 7:13:31 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> arr=new ArrayList<>();


        int row= matrix.length;
        int col=matrix[0].length;


        int left=0;
        int right=col-1;
        int top=0;
        int bottom=row-1;

        while(left<=right && top<=bottom){
            // ** left to right => top to bottopm => right to left => bottom to up

            // (at top)left to right
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
              top++;

            //(at right) top to bottom
            for(int i=top;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;

            //(at bottom)right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            

            //(at left) bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                arr.add(matrix[i][left]);
                }
                left++;
            }
            
        }

        return arr;


    }
}