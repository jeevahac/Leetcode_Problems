// Last updated: 7/24/2025, 9:25:21 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Shift to 0-based indexing
            int remainder = columnNumber % 26;
            char currentChar = (char) ('A' + remainder);
            result.insert(0, currentChar);
            columnNumber /= 26;
        }

        return result.toString();
    }
}
