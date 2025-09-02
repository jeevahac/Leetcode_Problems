// Last updated: 9/2/2025, 4:27:30 PM
class Solution {
    public boolean isPalindrome(String str) {
        
        str=str.toLowerCase();

        int left=0;
        int right=str.length()-1;

        while(left<=right){
            
            if(!Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            else if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }

        }

        return true;
    }
}