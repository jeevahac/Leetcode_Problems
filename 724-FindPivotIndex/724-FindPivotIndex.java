// Last updated: 7/24/2025, 9:24:24 PM
class Solution {
    public int pivotIndex(int[] arr) {  // or Equilibrium Index

        int total_sum=0;

        for(int num:arr){
            total_sum+=num;
        }

        int left_sum=0;

        for(int i=0;i<arr.length;i++){
            total_sum=total_sum-arr[i];
            if(total_sum==left_sum){
                return i;
            }
            else{
                left_sum=left_sum+arr[i];
            }
        }
        
        return -1;
    }
}