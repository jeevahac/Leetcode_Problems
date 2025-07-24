// Last updated: 7/24/2025, 9:24:32 PM
import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {

        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);

        BigInteger result = n1.add(n2);
        return result.toString();  // return result as string
        
    }
}