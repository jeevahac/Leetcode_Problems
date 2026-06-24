// Last updated: 6/24/2026, 4:43:19 PM
1class Solution {
2    public int longestOnes(int[] arr, int k) {
3        
4        int l=0,r=0,n=arr.length,max_len=0,zero_count=0;
5
6        
7        while(r<n){
8            if(arr[r]==0){
9                zero_count++;
10            }
11            if(zero_count>k){
12                if(arr[l]==0){
13                    zero_count--;
14                }
15                l++;
16            }
17            if(zero_count<=k){
18                int len=r-l+1;
19                max_len=Math.max(max_len, len);
20            }
21            
22            r++;
23        }
24        
25        return max_len;
26        
27    }
28}