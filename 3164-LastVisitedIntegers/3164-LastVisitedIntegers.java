// Last updated: 7/24/2025, 9:24:00 PM
class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        
        int consecutiveNegativeOnes = 0; // Tracks consecutive -1's
        
        for (int num : nums) {
            if (num != -1) {
                // If a positive integer is encountered, push it onto the stack
                stack.push(num);
                consecutiveNegativeOnes = 0; // Reset the count of consecutive -1's
            } else {
                // If -1 is encountered
                consecutiveNegativeOnes++;
                
                if (consecutiveNegativeOnes <= stack.size()) {
                    // Get the k-th element from the top of the stack
                    ans.add(stack.get(stack.size() - consecutiveNegativeOnes));
                } else {
                    // If k is greater than the size of the stack, append -1 to the result
                    ans.add(-1);
                }
            }
        }
        
        return ans;



        
    }
}