// Last updated: 9/8/2025, 9:11:43 AM
class Solution {
    public boolean canPartition(int[] arr) {
        
        int sum=0;

        for(int num:arr){
            sum+=num;
        }

        if(sum%2!=0){
            return false;
        }

        int target=sum/2;

        boolean dp[]=new boolean[target+1];
        dp[0]=true;
        for(int num:arr){
            for(int j=target;j>=num;j--){
                dp[j]=dp[j]||dp[j-num];

                if(dp[target]){ //earlier if we found, return true no need unnecessary traversal;
                    return true;
                }
            }
        }

        return dp[target];
    }
}