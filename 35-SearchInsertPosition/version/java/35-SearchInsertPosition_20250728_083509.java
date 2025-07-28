// Last updated: 7/28/2025, 8:35:09 AM
class Solution {
    public int searchInsert(int[] nums, int target) {

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>=target){
        //         return i;
        //     }
            
        // }
        // return nums.length;  // when it is present at the last index

        int left=0;
        int right=nums.length-1;

        int ans=nums.length;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]>=target){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}