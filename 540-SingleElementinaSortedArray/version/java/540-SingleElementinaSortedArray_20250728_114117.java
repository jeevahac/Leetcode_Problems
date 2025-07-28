// Last updated: 7/28/2025, 11:41:17 AM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int sum=0;

        for(int num:nums){
            sum^=num;
        }
        return sum;
    }
}