// Last updated: 7/24/2025, 9:24:05 PM
class Solution {
    public int smallestEvenMultiple(int n) {

        if((n & 1) == 0)
            return n;
        else
            return 2*n;
        
    }
}