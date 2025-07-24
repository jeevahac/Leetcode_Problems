// Last updated: 7/24/2025, 9:25:29 PM
class Solution {
    public boolean isPalindrome(String s) {

        int index=0;

        s=s.toLowerCase();
        char arr[]=s.toCharArray();

        String result="";

        for(int i=0;i<arr.length;i++){
             if (Character.isLetterOrDigit(arr[i])) {
                result += arr[i];
            }
        }


        int left=0;
        int right=result.length()-1;

        while(left<right){
            if(result.charAt(left)!=result.charAt(right)){
                return false;
            }
            left++;
            right--;

        }

        return true;


        
        
    }
}