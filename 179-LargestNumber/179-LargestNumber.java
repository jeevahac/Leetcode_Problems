// Last updated: 7/24/2025, 9:25:17 PM
class Solution {
    public String largestNumber(int[] nums) {

        String str[]=new String[nums.length];

        for(int i=0;i<nums.length;i++){
            str[i]=Integer.toString(nums[i]);
        }

        Arrays.sort(str, (a,b)->(b+a).compareTo(a+b));

        if(str[0].equals("0")){
            return "0";
        }

        StringBuilder sb=new StringBuilder();
        for(String num: str){
            sb.append(num);
        }

        return sb.toString();
        
    }
}