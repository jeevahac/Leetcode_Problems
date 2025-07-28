// Last updated: 7/28/2025, 9:57:47 AM
class Solution {
    public static int lowerBound(int[] nums, int x) {
       
       int left=0;
       int right=nums.length-1;
       int ans=nums.length;

       while(left<=right){
        int mid=(left+right)/2;

        if(nums[mid]>=x){
            ans=mid;
            right=mid-1;
        }
        else{
            left=mid+1;
        }
       }

       return ans;
    }

     public static int upperBound(int[] nums, int x) {
        
        int left=0;
        int right=nums.length-1;

        int ans=nums.length;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]<=x){
                left=mid+1;
            }
            else{
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
     }
    public static int[] searchRange(int[] nums, int target) {
        
        // int ans_start=-1;
        // int ans_end=-1;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){

        //         if(ans_start==-1){
        //             ans_start=i;
        //         }

        //         ans_end=i;
        //     }
        // }

        // return new int[] {ans_start,ans_end};

        int lb=lowerBound(nums,target);
        int ub=upperBound(nums,target);

        if(lb==nums.length || nums[lb]!=target) return new int[] {-1,-1};

        else{
            return new int[] {lb,ub-1};
        }
    }
}