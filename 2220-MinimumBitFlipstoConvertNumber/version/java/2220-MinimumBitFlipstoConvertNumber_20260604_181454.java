// Last updated: 6/4/2026, 6:14:54 PM
1class Solution {
2    public int minBitFlips(int start, int goal) {
3
4        int ans= start^goal;
5
6        int count=0;
7
8        while(ans!=0){
9            ans= ans&(ans-1);
10            count++;
11        }
12
13        return count;
14        
15    }
16}