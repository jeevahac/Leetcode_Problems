// Last updated: 7/30/2025, 9:04:04 AM
class Solution {
    public String reverseWords(String s) {

        StringBuilder sb=new StringBuilder();

        String words[]=s.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            if(i>0){
                sb.append(words[i]+" ");
            }
            else{
                sb.append(words[i]);
            }
            
        }
        return sb.toString();
        
    }
}