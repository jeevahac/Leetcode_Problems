// Last updated: 7/24/2025, 9:24:48 PM
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // Sort in ascending order
        //0 1 3 5 6
        int n = citations.length;  //5
        for (int i = 0; i < n; i++) {
            int h = n - i; // h=5-0, h=5-1, h=5-2
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
