// Last updated: 7/24/2025, 9:25:56 PM
class Solution {
    public int strStr(String haystack, String needle) {

        int length1=haystack.length();
        int length2=needle.length();

        if(length2>length1){
            return -1;
        }

        for(int i=0;i<=length1-length2;i++){
            if(haystack.substring(i,i+length2).equals(needle)){
                return i;
            }
        }

        return -1;
        
    }
}