// Last updated: 9/2/2025, 8:05:55 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        
        int max_len=0;
        int curr_len=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                curr_len++;
                max_len=Math.max(max_len,curr_len);
            }
            else{
                curr_len=0;

            }
        }
        return max_len;

    }
}