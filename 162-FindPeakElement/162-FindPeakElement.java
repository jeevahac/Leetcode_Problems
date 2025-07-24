// Last updated: 7/24/2025, 9:25:23 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Check if the mid element is greater than the next element
            if (nums[mid] > nums[mid + 1]) {
                // If true, then the peak must be on the left side (including mid)
                right = mid;
            } else {
                // Otherwise, the peak is on the right side
                left = mid+1;
            }
        }
        
        // At the end of the while loop, left and right will converge at the peak element
        return left;
    }
}
