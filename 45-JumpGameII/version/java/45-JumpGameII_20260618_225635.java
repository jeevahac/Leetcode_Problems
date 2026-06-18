// Last updated: 6/18/2026, 10:56:35 PM
1class Solution {
2    public int jump(int[] arr) {
3
4        int left=0,right=0,jump_count=0;
5        
6        int n= arr.length;
7        while(right<n-1){
8            
9            int max_jumps=0;
10            
11            for(int i=left;i<=right;i++){
12                
13                max_jumps=Math.max(max_jumps, i+arr[i]); // same like jump 1 game find the max_jump can be done in that range (choose the max jump) 
14            }
15            
16            left=right+1;
17            right=max_jumps;
18            jump_count++;
19        }
20        
21        return jump_count;
22        
23    }
24}