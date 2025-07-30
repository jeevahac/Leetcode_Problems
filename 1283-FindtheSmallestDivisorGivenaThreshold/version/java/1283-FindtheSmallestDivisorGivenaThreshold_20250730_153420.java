// Last updated: 7/30/2025, 3:34:20 PM
class Solution {

    public static int divisor(int arr[],int n){

        int sum=0;

        for(int num:arr){
            sum=sum+ (int) Math.ceil((double) num/n);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {

        int max=Integer.MIN_VALUE;

        for(int num:nums){
            if(num>max){
                max=num;
            }
        }

        int left=1;
        int right=max;

        while(left<=right){
            int mid=(left+right)/2;
            int sum=divisor(nums,mid);

            if(sum>threshold){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

        return left;
        
    }
}