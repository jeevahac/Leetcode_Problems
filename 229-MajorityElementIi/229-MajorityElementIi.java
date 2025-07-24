// Last updated: 7/24/2025, 9:25:02 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        ArrayList <Integer> arr=new ArrayList<>();
        int n=nums.length;

        Map <Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(map.get(nums[i]) > n/3  && !arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        
        return arr;
    }
}