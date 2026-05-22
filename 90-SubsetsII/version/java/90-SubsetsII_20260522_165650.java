// Last updated: 5/22/2026, 4:56:50 PM
1class Solution {
2
3    public static void findCombinations(int index, int arr[], List<List<Integer>> ans, List<Integer> ds) {
4
5        // Add current subset
6        ans.add(new ArrayList<>(ds));
7
8        for (int i = index; i < arr.length; i++) {
9
10            // Skip duplicates
11            if (i > index && arr[i] == arr[i - 1]) {
12                continue;
13            }
14
15            // Pick
16            ds.add(arr[i]);
17
18            // Recursive call
19            findCombinations(i + 1, arr, ans, ds);
20
21            // Backtrack
22            ds.remove(ds.size() - 1);
23        }
24    }
25    public List<List<Integer>> subsetsWithDup(int[] arr) {
26
27        Arrays.sort(arr);
28
29        List<List<Integer>> ans = new ArrayList<>();
30
31        findCombinations(0, arr, ans, new ArrayList<>());
32
33        return ans;
34        
35    }
36}