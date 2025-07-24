// Last updated: 7/24/2025, 9:25:24 PM
class Solution {
    public String reverseWords(String s) {

        String words[]=s.trim().split("\\s+");

        StringBuilder result=new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);

            if(i!=0){
                result.append(" ");
            }
        }

        return result.toString();

        
    }
}