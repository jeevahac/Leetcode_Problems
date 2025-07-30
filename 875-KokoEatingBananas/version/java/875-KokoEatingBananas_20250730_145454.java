// Last updated: 7/30/2025, 2:54:54 PM
class Solution {

    public static int time_taken(int arr[], int k){

        int total_hour=0;

        for(int i=0;i<arr.length;i++){
            total_hour+= Math.ceil((double) arr[i]/k);
        }

        return total_hour;
    }

    public int minEatingSpeed(int[] piles, int h) {
        
        int max=Integer.MIN_VALUE;
        for(int num: piles){
            if(num>max){
                max=num;
            }
        }

        int low=1;
        int high=max;
        int ans=1;

        while(low<=high){
            int mid=(low+high)/2;

            int hours=time_taken(piles,mid);

            if(hours<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}