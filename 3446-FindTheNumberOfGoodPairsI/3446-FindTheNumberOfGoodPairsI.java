// Last updated: 7/24/2025, 9:23:57 PM
class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        
        int count=0;

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] % (nums2[j]*k)==0){
                    count++;
                }
            }
        }
        return count;
    }
}