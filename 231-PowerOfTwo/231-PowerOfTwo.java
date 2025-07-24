// Last updated: 7/24/2025, 9:25:01 PM
class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n<=0){
            return false;
        }

        while(n%2==0){
            n=n/2;
        }

        return n==1;

        
    }
}