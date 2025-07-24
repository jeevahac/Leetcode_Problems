// Last updated: 7/24/2025, 9:25:45 PM
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the digit is less than 9, increment it and return the array
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0
            digits[i] = 0;
        }

        // If all digits were 9, we need an additional digit at the start
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // The rest are already 0 by default
        return newDigits;
    }

}