// Last updated: 6/24/2026, 4:09:31 PM
1class Solution {
2    public int longestOnes(int[] arr, int k) {
3        int max_len=0;
4        int n=arr.length;
5        
6        for(int i=0;i<n;i++){
7            int zero_count=0;
8            
9            for(int j=i;j<n;j++){
10                
11                if(arr[j]==0){
12                    zero_count++;
13                }
14                if(zero_count<=k){
15                    int len= j-i+1;
16                    max_len=Math.max(max_len, len);
17                }
18                else{
19                    break;
20                }
21            }
22        }
23        
24        return max_len;
25        
26    }
27}