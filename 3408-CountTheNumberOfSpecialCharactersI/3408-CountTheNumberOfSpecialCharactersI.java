// Last updated: 7/24/2025, 9:24:01 PM
class Solution {
    public int numberOfSpecialChars(String word) {
        
        Set<Character> lowercase_set=new HashSet<>();
        Set<Character> uppercase_set=new HashSet<>();

        for(char ch: word.toCharArray()){
            if(Character.isLowerCase(ch)){
                lowercase_set.add(ch);
            }
            else if(Character.isUpperCase(ch)){
                ch=Character.toLowerCase(ch);
                uppercase_set.add(ch);
            }
        }

        int count=0;

        for(char ch='a';ch<='z';ch++){
            if(lowercase_set.contains(ch) && uppercase_set.contains(ch)){
                count++;
            }
        }
        return count;

    }
}