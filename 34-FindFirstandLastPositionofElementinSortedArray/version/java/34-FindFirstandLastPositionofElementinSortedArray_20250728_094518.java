// Last updated: 7/28/2025, 9:45:18 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int ans_start=-1;
        int ans_end=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){

                if(ans_start==-1){
                    ans_start=i;
                }

                ans_end=i;
            }
        }

        return new int[] {ans_start,ans_end};
    }
}