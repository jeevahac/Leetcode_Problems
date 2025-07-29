// Last updated: 7/29/2025, 3:09:56 PM
class Solution {

    public static int possible(int day,int arr[],int m,int k){
        int count=0;
        int no_of_bouquets=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                no_of_bouquets+=count/k;
                count=0;
            }
        }
        no_of_bouquets+=count/k;

        if(no_of_bouquets>=m){
            return 1;
        }
        else{
            return 0;
        }
    }
    public int minDays(int[] bloomDay, int m, int k) {

        int n=bloomDay.length;
    
        if(n<m*k){
            return -1; // impossible thing
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int num: bloomDay){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }

        int low=min;
        int high=max;

        int ans=-1;

        while(low<=high){

            int mid=(low+high)/2;

            if(possible(mid,bloomDay,m,k)==1){
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