// Last updated: 8/11/2025, 9:27:33 AM
class Solution {
    public boolean search(int[] nums, int target) {
        
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target){
                return true;
            }
            // to check whether the left side array is sorted
             if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }
            else if(nums[left]<= nums[mid]){

                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }

        }
        return false;
    }
}