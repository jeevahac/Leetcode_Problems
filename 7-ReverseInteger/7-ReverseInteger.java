// Last updated: 7/24/2025, 9:26:08 PM
class Solution {
    public int reverse(int x) {

        int sum=0;
        while(x!=0){
            int rem=x%10;
            if(sum>Integer.MAX_VALUE/10 || sum<Integer.MIN_VALUE/10){
                return 0;  //After multiplying the sum with 10 the value will go beyond the range so divide it by unit digit
            }
            sum=rem+(sum*10);
            x=x/10;
        }

        return sum;
        
    }
}