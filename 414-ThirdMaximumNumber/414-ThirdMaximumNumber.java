// Last updated: 7/24/2025, 9:24:33 PM
class Solution {
    public int thirdMax(int[] nums) {

        HashSet<Integer> hash=new HashSet<>();

        for(int num: nums){
            hash.add(num);
        }

        List<Integer> list = new ArrayList<>(hash);

        Collections.sort(list, Collections.reverseOrder());

        // Return the third maximum if it exists, otherwise return the maximum
        if (list.size() >= 3) {
            return list.get(2);
        } else {
            return list.get(0);
        }
        
    }
}