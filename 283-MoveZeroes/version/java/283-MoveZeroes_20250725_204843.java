// Last updated: 7/25/2025, 8:48:43 PM
class Solution {
    public void moveZeroes(int[] nums) {

        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }

        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
        
    }
}