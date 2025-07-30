// Last updated: 7/30/2025, 4:00:57 PM
class Solution {

    public static int Day_calculate(int capacity,int weights[]){

        int days=1;
        int load=0;

        for(int i=0;i<weights.length;i++){
            if(load+weights[i]<=capacity){
                load=load+weights[i];
            }
            else{
                days=days+1;
                load=weights[i];
            }
        }
        
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {

        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int num:weights){
            if(num>max){
                max=num;
            }
            sum=sum+num;
        }

        int left=max;
        int right=sum;

        while(left<=right){
            int mid=(left+right)/2;

            int days_required=Day_calculate(mid,weights);

            if(days_required<=days){  // within 1 day the task is finishable means then decrease the capacity
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        return left;
        
    }
}