// Last updated: 7/27/2025, 7:45:43 PM
class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize for subarrays starting from index 0

        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}