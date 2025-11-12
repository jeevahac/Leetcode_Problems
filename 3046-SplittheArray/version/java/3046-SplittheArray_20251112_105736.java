// Last updated: 11/12/2025, 10:57:36 AM
class Solution {
    public boolean isPossibleToSplit(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num)>2){
                return false;
            }

        }
        return true;


        
    }
}