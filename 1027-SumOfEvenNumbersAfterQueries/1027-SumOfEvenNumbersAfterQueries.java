// Last updated: 7/24/2025, 9:24:13 PM
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int n = nums.length;
        int l  = queries.length;
        int res[] = new int[n];

        for(int i=0; i<l ; i++){
            int val =  queries[i][0];
            int index =  queries[i][1];

            nums[index] += val;

            int sum=0;

            for(int k=0; k<n; k++){
                if(nums[k] % 2 == 0){
                    sum += nums[k];
                }
            }
            res[i] =  sum;

        }

        return res;
        
    }
}