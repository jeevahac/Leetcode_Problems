// Last updated: 6/14/2026, 11:08:35 AM
1class Solution {
2    public int maxProduct(int[] arr) {
3        
4
5        // Get the length of the array
6        int n = arr.length;
7
8        // Initialize prefix and suffix product
9        int pre = 1, suff = 1;
10
11        // Initialize answer with smallest integer
12        int ans = Integer.MIN_VALUE;
13
14        // Traverse from both left and right
15        for (int i = 0; i < n; i++) {
16            // Reset prefix if zero
17            if (pre == 0) pre = 1;
18
19            //Reset suffix if zero
20            if (suff == 0) suff = 1;
21
22            // Multiply prefix with current element from front
23            pre *= arr[i];
24
25            // Multiply suffix with current element from back
26            suff *= arr[n - i - 1];
27
28            // Update maximum value so far
29            ans = Math.max(ans, Math.max(pre,suff));
30        }
31
32        // Return the final result
33        return ans;
34
35
36
37
38        // int max_prod= arr[0];
39
40        // for(int i=0;i<arr.length;i++){
41
42        //     int prod=1;
43
44        //     for(int j=i;j<arr.length;j++){
45
46        //         prod=prod* arr[j];
47        //         max_prod=Math.max(max_prod, prod);
48        //     }
49            
50        // }
51
52        // return max_prod;
53    }
54}