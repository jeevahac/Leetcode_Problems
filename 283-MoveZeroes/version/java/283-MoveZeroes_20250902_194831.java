// Last updated: 9/2/2025, 7:48:31 PM
class Solution {
    public void moveZeroes(int[] nums) {
        
        int arr[]=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[index++]=nums[i];
            }
        }

        for(int i=index;i<nums.length;i++){
            arr[index++]=0;
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }

    }
}