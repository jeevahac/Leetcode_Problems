// Last updated: 9/2/2025, 5:03:44 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        
    //     Set<Integer> set=new LinkedHashSet<>();

    //     for(int num: nums){
    //         set.add(num);
    //     }

    //     int i=0;
    //     for(int num: set){
    //         nums[i++]=num;
    //     }

    //     return set.size();
    // }

    // optimal solution strivers

    int i=0;

    for(int j=1;j<nums.length;j++){
        if(nums[i]!=nums[j]){
            nums[i+1]=nums[j];
            i++;
        }
    }

    return i+1;
    }
}