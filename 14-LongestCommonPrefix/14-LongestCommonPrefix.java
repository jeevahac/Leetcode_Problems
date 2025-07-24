// Last updated: 7/24/2025, 9:26:02 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // Edge case: If array is empty, return empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take the first string as reference
        String prefix = strs[0];
        
        // Iterate through the remaining strings
        for (int i = 1; i < strs.length; i++) {
            
            // Compare the prefix with the next string in the array
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
