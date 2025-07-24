// Last updated: 7/24/2025, 9:25:55 PM
class Solution {
    public int divide(int dividend, int divisor) {

        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
    
       return dividend/divisor; 
        
    }
}