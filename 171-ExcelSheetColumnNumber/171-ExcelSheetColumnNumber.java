// Last updated: 7/24/2025, 9:25:19 PM
class Solution {
    public int titleToNumber(String columnTitle) {

        int result=0;

        for(int i=0;i<columnTitle.length();i++){
            char c=columnTitle.charAt(i);

            int value= c - 'A' +1;

            result=result*26+value;
        }

        return result;
        
    }
}