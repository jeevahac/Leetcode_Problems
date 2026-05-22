// Last updated: 5/22/2026, 8:57:59 AM
1class Solution {  
2    public int rob(int[] arr) {
3
4        
5        int prev= arr[0];
6        int prev2= 0;
7        
8        
9        for(int i=1;i<arr.length;i++){
10            
11            int pick = arr[i]+ prev2;
12            
13            int notpick= 0 + prev;
14            
15            int curr= Math.max(pick,notpick);
16            
17            // Important
18            
19            prev2=prev;
20            prev=curr;
21        }
22        
23        return prev;         
24    }
25}