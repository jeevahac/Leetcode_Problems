// Last updated: 7/24/2025, 9:26:07 PM
class Solution {
    public boolean isPalindrome(int num) {

        if(num<0){
            return false;
        }
        int temp=num;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=rem+(sum*10);
            num=num/10;
        }
        return temp==sum;
        
    }
}