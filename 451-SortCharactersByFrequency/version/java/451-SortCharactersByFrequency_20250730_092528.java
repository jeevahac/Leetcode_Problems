// Last updated: 7/30/2025, 9:25:28 AM
class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> map=new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: Sort list by frequency (descending)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // Step 4: Build the result string
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 1; i <= freq; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();


        
    }
}