// Last updated: 9/8/2025, 9:03:15 AM
class Solution {
    public int[] dailyTemperatures(int[] arr) {
        
        int res[]=new int[arr.length];

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<arr.length;i++){

            while(!stack.isEmpty() &&  arr[stack.peek()]<arr[i] ){
                
                int previous_index=stack.pop();
                res[previous_index]=i-previous_index;
            }
            stack.push(i);

        }

        return res;
    }
}