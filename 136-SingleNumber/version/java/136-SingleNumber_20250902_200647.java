// Last updated: 9/2/2025, 8:06:47 PM
class Solution {
    public int singleNumber(int[] arr) {
        
        int sum=0;

        for(int num:arr){
            sum^=num;
        }
        return sum;
    }
}