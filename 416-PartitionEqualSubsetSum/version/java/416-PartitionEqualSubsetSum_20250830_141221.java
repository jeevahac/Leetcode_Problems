// Last updated: 8/30/2025, 2:12:21 PM
class Solution {
    public boolean canPartition(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        if (sum % 2 != 0) return false;
        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }
}
