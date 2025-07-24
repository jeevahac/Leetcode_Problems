// Last updated: 7/24/2025, 9:24:41 PM
class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
    
        for(int i=0;i<len/2;i++){
            char temp=s[i];
            s[i]=s[len-i-1];
            s[len-i-1]=temp;
        }

        
    }
}