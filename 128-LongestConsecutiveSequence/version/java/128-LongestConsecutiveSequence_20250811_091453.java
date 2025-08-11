// Last updated: 8/11/2025, 9:14:53 AM
class Solution {
    public int longestConsecutive(int[] nums) {

        Set <Integer> set=new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int max_count=0;

        for(int num: set){
            if(!set.contains(num-1)){
                int count=1;
                while(set.contains(num+1)){
                    count++;
                    num++;
                }
                max_count=Math.max(max_count, count);

            }
        }

        return max_count;
    }
}