// Last updated: 7/24/2025, 9:25:47 PM
class Solution {
    public int lengthOfLastWord(String s) {

        /*int length=0;
        int i=s.length()-1;

        // Skip trailing or last spaces in the word
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }

        // Count the length of the last word utill it reaches the space
         while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }

        
        return length;

        */

        String words[]=s.trim().split("\\s+");

        return (words[words.length-1]).length();

        



        
    }
}