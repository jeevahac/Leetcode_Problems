// Last updated: 7/24/2025, 9:25:51 PM
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int maxReach = 0;
        int currentEnd = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = maxReach;
            }
        }

        return jumps;
    }
}
