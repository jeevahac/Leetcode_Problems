// Last updated: 6/24/2026, 4:23:42 PM
1class Solution {
2    public int longestOnes(int[] arr, int k) {
3        int max_len=0;
4        
5        int l=0, r=0, n=arr.length,zero_count=0;
6        
7        while(r<n){
8            
9            if(arr[r]==0){
10                zero_count++;
11            }
12            if(zero_count<=k){
13                int len= r-l+1;
14                max_len=Math.max(max_len, len);
15            }
16            else{ // which is greater than k
17                while(zero_count>k){
18                    if(arr[l]==0){
19                        zero_count--;
20                    }
21                    l++;
22                }
23            }
24            r++;
25        }
26        
27        return max_len;
28        
29    }
30}