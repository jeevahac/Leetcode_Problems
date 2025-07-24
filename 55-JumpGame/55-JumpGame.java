// Last updated: 7/24/2025, 9:25:48 PM
// Code (Greedy Approach)

class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // Can't reach this index
            }
            maxReach = Math.max(maxReach, i + nums[i]); //i is your current position in the array.  nums[i] tells you how far you can jump from that position.
        }
        return true;
    }
}
