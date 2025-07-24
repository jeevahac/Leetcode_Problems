// Last updated: 7/24/2025, 9:25:58 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> set = new LinkedHashSet<>(); // Keeps values in sorted order

        for (int num : nums) {
            set.add(num);
        }

        int i = 0;
        for (int num : set) {
            nums[i++] = num; // Copy back to nums
        }

        return set.size(); // Return number of unique elements
    }
}

// class Solution {
//     public int removeDuplicates(int[] nums) {
//          int j=1;

//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]!=nums[i+1]){
//                 nums[j]=nums[i+1];
//                 j++;
//             }
//         }
//         return j;
        
//     }
// }