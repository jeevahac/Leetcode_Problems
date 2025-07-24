// Last updated: 7/24/2025, 9:23:58 PM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {

        List<Integer> result = new ArrayList<>();
        int skipCounter = 0;

        int row=grid.length-1;
        int col=grid[0].length-1;

        for (int i = 0; i <=row; i++) {
            if (i % 2 == 0) {
                // Left to right
                for (int j = 0; j<=col; j++) {
                    if (skipCounter % 2 == 0) {
                        result.add(grid[i][j]);
                    }
                    skipCounter++;
                }
            } else {
                // Right to left
                for (int j = col; j >= 0; j--) {
                    if (skipCounter % 2 == 0) {
                        result.add(grid[i][j]);
                    }
                    skipCounter++;
                }
            }
        }
        return result;
        
    }
}