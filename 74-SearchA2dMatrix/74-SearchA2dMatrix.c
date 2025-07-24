// Last updated: 7/24/2025, 9:25:39 PM
bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target) {
    for(int i=0;i<matrixSize;i++){
        for(int j=0;j<*matrixColSize;j++){
            if( matrix[i][j]==target){
                return true;
            }
        }
    }
    return false;
    
}