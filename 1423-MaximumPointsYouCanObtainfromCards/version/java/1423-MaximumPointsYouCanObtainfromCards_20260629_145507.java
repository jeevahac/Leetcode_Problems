// Last updated: 6/29/2026, 2:55:07 PM
1class Solution {
2    public int maxScore(int[] arr, int k) {
3
4        int l_sum=0, r_sum=0;
5        
6        for(int i=0;i<=k-1;i++){
7            l_sum+=arr[i];
8        }
9        
10        int max_sum=l_sum; // Assuming l_sum is Maximum as of now
11        
12        int r_index=arr.length-1;
13        
14        for(int i=k-1; i>=0;i--){
15            l_sum-=arr[i];
16            r_sum+=arr[r_index];
17            
18            r_index--; // right index is keep on decresing;
19            
20            
21            max_sum=Math.max(max_sum, l_sum +r_sum);;
22        }
23        
24        return max_sum;
25        
26    }
27}