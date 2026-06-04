// Last updated: 6/4/2026, 6:04:14 PM
1class Solution {
2    public int divide(int dividend, int divisor) {
3         if(dividend==divisor) {  // if both are same then it will be 1
4            return 1;
5        }
6        
7        boolean sign= true;
8        
9        if( (dividend>0 && divisor<0) || (dividend<0 && divisor>0) ){
10            sign =false;
11        }
12        
13        long n= Math.abs((long)dividend);
14        long d= Math.abs((long)divisor);
15        
16        long quotient=0;
17        
18        while(n>=d){
19            int count=0;
20            
21            while(n>=(d<<count+1)){ // 3* 2^1 or 3<<1  which is 3* 2 power 1 => 6
22                count++;
23                
24            }
25            
26            quotient+= 1L<<count; // 2^count values need to be added;
27            n= n-(d<<count);
28        }
29        
30        // for overflowing condition if it is grater than 2^31 and sign is truue;
31        if(quotient> Integer.MAX_VALUE && sign){
32            return Integer.MAX_VALUE;
33        }
34        if(quotient> Integer.MAX_VALUE && !sign){
35            return Integer.MIN_VALUE;
36        }
37        
38        return sign? (int)quotient:(int) -quotient;
39    }
40}