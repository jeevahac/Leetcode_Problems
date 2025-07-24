// Last updated: 7/24/2025, 9:26:11 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int start=0;
        int max_length=0;

        int lastseen[]=new int[256];
        for(int i=0;i<s.length();i++){
            char current_char=s.charAt(i);
            if(lastseen[current_char]>start){
                start=lastseen[current_char];
            }
            lastseen[current_char]=i+1;
            max_length=Math.max(max_length,i+1-start);
        }
        return max_length;

        /*int left=0;
        int right = 0;
        int dis = Math.min(s.length(),1);
        Set<Character> seen =  new HashSet<>();

        while(right < s.length()){
            char c =  s.charAt(right);
            while(seen.contains(c)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(c);
            int g = right - left + 1;
            dis = Math.max(dis,g);
            right++;

        }
        return dis;
        */
        
    }
}