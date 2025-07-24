// Last updated: 7/24/2025, 9:25:20 PM
class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();

        int n=nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) > n/2 ){
                return nums[i];
            }
        }
        return -1;
        
    }
}