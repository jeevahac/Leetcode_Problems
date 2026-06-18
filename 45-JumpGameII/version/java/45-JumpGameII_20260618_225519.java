// Last updated: 6/18/2026, 10:55:19 PM
1class Solution {
2    public int jump(int[] nums) {
3        int jumps = 0;
4        int maxReach = 0;
5        int currentEnd = 0;
6
7        for (int i = 0; i < nums.length - 1; i++) {
8            maxReach = Math.max(maxReach, i + nums[i]);
9
10            if (i == currentEnd) {
11                jumps++;
12                currentEnd = maxReach;
13            }
14        }
15
16        return jumps;
17    }
18}
19