// Last updated: 6/1/2026, 8:01:28 PM
1import java.util.*;
2
3class Solution {
4
5    public void backtrack(int start, int k, int target,
6                          List<Integer> ds,
7                          List<List<Integer>> ans) {
8
9        if (ds.size() == k) {
10            if (target == 0) {
11                ans.add(new ArrayList<>(ds));
12            }
13            return;
14        }
15
16        for (int i = start; i <= 9; i++) {
17
18            if (i > target) {
19                break; // pruning
20            }
21
22            ds.add(i);
23
24            backtrack(i + 1, k, target - i, ds, ans);
25
26            ds.remove(ds.size() - 1);
27        }
28    }
29
30    public List<List<Integer>> combinationSum3(int k, int n) {
31
32        List<List<Integer>> ans = new ArrayList<>();
33
34        backtrack(1, k, n, new ArrayList<>(), ans);
35
36        return ans;
37    }
38}