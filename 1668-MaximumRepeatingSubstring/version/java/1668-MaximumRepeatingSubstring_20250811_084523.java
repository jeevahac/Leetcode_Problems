// Last updated: 8/11/2025, 8:45:23 AM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        String repeated = word;

        while (sequence.contains(repeated)) {
            k++;
            repeated += word; // repeat word again
        }
        
        return k;
    }
}
