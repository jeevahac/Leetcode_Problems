// Last updated: 6/4/2026, 3:12:46 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3
4        if(n<=0){
5            return false;
6        }
7
8
9        if((n&(n-1))==0){
10            return true;
11        }
12        else{
13            return false;
14        }
15        
16    }
17}