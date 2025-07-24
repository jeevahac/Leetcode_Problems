// Last updated: 7/24/2025, 9:24:25 PM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;

        int n=bits.length-1;
        while (i < n) {
            if (bits[i] == 1) {
                i += 2; // 2-bit character
            } else {
                i += 1; // 1-bit character
            }
        }

        // If we land exactly on the last character, it's a one-bit character
        return i == n;
    }
}
