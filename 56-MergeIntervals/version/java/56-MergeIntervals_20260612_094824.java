// Last updated: 6/12/2026, 9:48:24 AM
1class Solution {
2    public int[][] merge(int[][] arr) {
3
4      Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
5
6        List<int[]> ans = new ArrayList<>();
7
8        for (int i = 0; i < arr.length; i++) {
9
10            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) {
11                ans.add(arr[i]);
12            } else {
13                ans.get(ans.size() - 1)[1] =
14                    Math.max(ans.get(ans.size() - 1)[1], arr[i][1]);
15            }
16        }
17
18        return ans.toArray(new int[ans.size()][]);
19
20
21        
22    }
23}