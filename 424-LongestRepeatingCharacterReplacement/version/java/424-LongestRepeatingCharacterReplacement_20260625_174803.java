// Last updated: 6/25/2026, 5:48:03 PM
1class Solution {
2    public int characterReplacement(String str, int k) {
3
4        int l=0,r=0,n=str.length(),max_freq=0,max_len=0;
5        
6        int hash[]=new int[26];
7        
8        while(r<n){
9            
10            hash[str.charAt(r)-'A']++;
11            max_freq=Math.max(max_freq, hash[str.charAt(r)-'A']);
12            
13            if((r-l+1)-max_freq>k){ // if it goes beyong the k
14                hash[str.charAt(l)-'A']--; // left side character reducing that hash value
15                l++;
16            }
17            
18            if( (r-l+1)-max_freq<=k){ // within condition
19                
20                max_len=Math.max(max_len, (r-l+1));
21            }
22            
23            r++;
24        }
25        
26        return max_len;
27        
28    }
29}