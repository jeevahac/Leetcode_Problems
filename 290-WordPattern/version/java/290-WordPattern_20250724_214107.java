// Last updated: 7/24/2025, 9:41:07 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();

        String[] words=s.trim().split("\\s");

        if (pattern.length() != words.length) {
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            char current_char=pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(current_char)){
                if(!map.get(current_char).equals(word)){
                    return false;
                }
            }
            else{
                if(set.contains(word)){
                    return false;
                }
                map.put(current_char,word);
                set.add(word);
            }

        }
        return true;
        
    }
}