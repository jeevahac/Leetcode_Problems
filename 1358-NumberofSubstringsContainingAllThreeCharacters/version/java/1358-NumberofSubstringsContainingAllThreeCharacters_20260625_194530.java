// Last updated: 6/25/2026, 7:45:30 PM
1class Solution {
2    public int numberOfSubstrings(String str) {
3
4        int n=str.length();
5        
6        int count=0;
7        
8        
9        int last_seen[]={-1,-1,-1}; 
10        for(int i=0;i<n;i++){
11            last_seen[str.charAt(i)-'a']=i; // Storing index
12            
13            if(last_seen[0]!=-1 && last_seen[1]!=-1 && last_seen[2]!=-1){
14                count += 1 +
15                     Math.min(
16                         last_seen[0],
17                         Math.min(last_seen[1],
18                                  last_seen[2])
19                     );
20            }
21            
22        }
23        
24        return count;
25        
26    }
27}