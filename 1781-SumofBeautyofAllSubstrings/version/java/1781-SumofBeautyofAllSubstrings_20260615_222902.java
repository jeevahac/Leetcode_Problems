// Last updated: 6/15/2026, 10:29:02 PM
1class Solution {
2    public int beautySum(String str) {
3         int n=str.length();
4        int sum=0;
5        
6        for(int i=0;i<n;i++){
7            
8            Map<Character, Integer> map=new HashMap<>();
9            
10            for(int j=i;j<n;j++){
11                char ch=str.charAt(j);
12                
13                map.put(ch, map.getOrDefault(ch,0)+1);
14                
15                int maxi=Integer.MIN_VALUE;
16                int mini=Integer.MAX_VALUE;
17            
18                for(int num: map.values()){
19                    maxi=Math.max(maxi, num);
20                    mini=Math.min(mini, num);
21                }
22                sum=sum+(maxi-mini);
23                
24            }
25        }
26        
27        return sum;
28       
29        
30    }
31}