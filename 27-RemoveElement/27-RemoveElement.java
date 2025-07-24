// Last updated: 7/24/2025, 9:25:57 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count++]=nums[i];


            }
        }
        return count;

        

        
    }
}