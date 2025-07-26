// Last updated: 7/26/2025, 5:27:37 PM
class Solution {
    public int maxSubArray(int[] arr) {

        
        int max_sum=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>max_sum){
                max_sum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }



        return max_sum;
    }
}