// Last updated: 7/24/2025, 9:24:04 PM
class Solution {
    public int countDigits(int num) {

        int temp=num;
        int count=0;

        while(num>0){
            int digit=num%10;
            if(temp%digit==0){
                count++;
            }
            num=num/10;
        }

        return count;
        
    }
}