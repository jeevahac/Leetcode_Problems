// Last updated: 9/2/2025, 8:03:32 PM
class Solution {
    public int missingNumber(int[] arr) {

        int n=arr.length;

        int sum= (n*(n+1))/2;

        for(int num:arr){
            sum-=num;
        }

        return sum;


        
    }
}