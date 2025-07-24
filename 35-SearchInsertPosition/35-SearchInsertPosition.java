// Last updated: 7/24/2025, 9:25:53 PM
class Solution {
    public int searchInsert(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
            
        }
        return nums.length;  // when it is present at the last index
    }
}