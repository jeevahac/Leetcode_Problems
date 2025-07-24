// Last updated: 7/24/2025, 9:26:04 PM
class Solution {
    public int romanToInt(String s) {

        Map<Character,Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(i+1<s.length()  && map.get(c)<map.get(s.charAt(i+1))){  // If suppose IX comes means I<X so X-I=9
                sum=sum+(map.get(s.charAt(i+1))-map.get(c));   // IX = X-I = 9 
                i=i+1;  // skip the next character IX 
            }
            else{
                sum=sum+map.get(c);
            }
        }
        return sum;
    }
}