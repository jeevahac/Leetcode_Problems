// Last updated: 5/27/2026, 6:40:57 PM
1class Solution {
2
3   
4    public double myPow(double x, int n) {
5
6
7        long N=n;
8
9        double mul=1;
10
11        if(N<0){
12            x=1/x;
13            N=-N;
14        }
15        
16        while(N>0){
17
18            if(N%2==1){
19                mul=mul*x;
20            }
21            
22            // even 
23            x=x*x;
24            N=N/2;
25        }
26
27        return mul;
28        
29    }
30}