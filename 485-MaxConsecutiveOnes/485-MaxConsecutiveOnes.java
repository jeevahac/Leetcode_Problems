// Last updated: 7/24/2025, 9:24:29 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {

        int max_len=0;
        int current_len=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                current_len++;
                max_len=Math.max(max_len,current_len);
            }
            else{
                current_len=0;
            }
        }

        return max_len;
        
    }
}