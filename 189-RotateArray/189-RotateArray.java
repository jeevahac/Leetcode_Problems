// Last updated: 7/24/2025, 9:25:16 PM
class Solution {
    public void rotate(int[] nums, int k) {

        
        k = k % nums.length; // handle large k

        int count=0;

        int arr[]=new int[nums.length];

        for(int i=nums.length-k;i<nums.length;i++){
            arr[count]=nums[i];
            count++;
        }

        for(int i=0;i<nums.length-k;i++){
            arr[count]=nums[i];
            count++;
        }

         // Copy back to original array
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        
    }
}