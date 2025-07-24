// Last updated: 7/24/2025, 9:24:23 PM
class Solution {
    public int[] dailyTemperatures(int[] nums) {

        int result[]=new int[nums.length];

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<nums.length;i++){
            
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                int previous_index=stack.pop();
                result[previous_index]=i-previous_index;
            }
            stack.push(i);
        }
        return result;
        
    }
}