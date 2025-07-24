// Last updated: 7/24/2025, 9:24:54 PM
import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        else{
            
            char strs[] =s.toCharArray();
            char strt[]=t.toCharArray();

            Arrays.sort(strs);
            Arrays.sort(strt);

            return Arrays.equals(strs,strt);

        }

      

    
        
    }
}