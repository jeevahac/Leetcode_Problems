// Last updated: 7/30/2025, 8:58:35 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }

        int[] count=new int[26];

        for(int i=0;i<s.length();i++){
            char char_s=s.charAt(i);
            char char_t=t.charAt(i);

            count[char_s-'a']++;
            count[char_t-'a']--;
        }

        for(int num:count){
            if(num!=0){
                return false;
            }
        }
        return true;

    }
}