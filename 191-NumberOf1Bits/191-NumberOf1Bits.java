// Last updated: 7/24/2025, 9:25:13 PM
import java.math.*;

class Solution {
    public int hammingWeight(int n) {

        int count=0;

        while(n!=0){
            count=count+(n&1);
            n=n>>1;
        }
        return count;
        
    }
}