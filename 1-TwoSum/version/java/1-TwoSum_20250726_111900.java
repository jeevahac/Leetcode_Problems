// Last updated: 7/26/2025, 11:19:00 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            
            map.put(nums[i],i);
            
        }
        return new int[] {-1,-1};
        
    }
}