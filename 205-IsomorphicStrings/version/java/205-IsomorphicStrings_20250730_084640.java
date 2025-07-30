// Last updated: 7/30/2025, 8:46:40 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Character> maps=new HashMap<>();
        HashMap<Character,Character> mapt=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char char_s=s.charAt(i);
            char char_t=t.charAt(i);

            if(maps.containsKey(char_s)){
                if(maps.get(char_s)!=char_t){
                    return false;
                }
            }
            else{
                maps.put(char_s,char_t);
            }


            if(mapt.containsKey(char_t)){
                if(mapt.get(char_t)!=char_s){
                    return false;
                }
            }
            else{
                mapt.put(char_t,char_s);
            }
            
        }

        return true;
        
    }
}