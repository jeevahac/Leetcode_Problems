// Last updated: 7/24/2025, 9:23:28 PM
class Solution {
    public int[] twoSum(int[] arr, int target) {

        Map<Integer ,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int x=target-arr[i];

            if(map.containsKey(x)){
                return new int[]{i,map.get(x)};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
        
    }
}