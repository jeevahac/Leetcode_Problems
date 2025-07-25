// Last updated: 7/24/2025, 9:24:20 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> set=new HashSet<>();

        for(char ch:jewels.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(char ch:stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}