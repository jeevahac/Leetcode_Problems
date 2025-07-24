// Last updated: 7/24/2025, 9:24:17 PM
class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length()){
            return false;
        }

        String combined=s+s;

        return combined.contains(goal);
        
    }
}