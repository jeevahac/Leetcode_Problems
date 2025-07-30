// Last updated: 7/30/2025, 8:51:55 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        
        return  s.length() == goal.length() && (s+s).contains(goal);
    }
}