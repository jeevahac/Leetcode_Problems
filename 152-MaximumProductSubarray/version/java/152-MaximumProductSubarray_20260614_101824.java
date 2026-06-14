// Last updated: 6/14/2026, 10:18:24 AM
1class Solution {
2    public int maxProduct(int[] arr) {
3        
4        int max_prod= arr[0];
5
6        for(int i=0;i<arr.length;i++){
7
8            int prod=1;
9
10            for(int j=i;j<arr.length;j++){
11
12                prod=prod* arr[j];
13                max_prod=Math.max(max_prod, prod);
14            }
15            
16        }
17
18        return max_prod;
19    }
20}