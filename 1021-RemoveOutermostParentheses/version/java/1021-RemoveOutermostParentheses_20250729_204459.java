// Last updated: 7/29/2025, 8:44:59 PM
class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb=new StringBuilder();

        int count=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(count>0){
                    sb.append(ch);
                }
                count++;
            }
            else if(ch==')'){
                count--;
                if(count>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}