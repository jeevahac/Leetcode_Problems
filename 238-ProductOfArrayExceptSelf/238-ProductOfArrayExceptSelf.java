// Last updated: 7/24/2025, 9:24:56 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        int[] prefix = new int[n];  // prefix[i] = product of nums[0..i-1]
        int[] suffix = new int[n];  // suffix[i] = product of nums[i+1..n-1]

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            output[i] = prefix[i] * suffix[i];
        }

        return output;
    }
}


/* Time Limit Exceeded
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int arr[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(!(i==j)){
                    product=product*nums[j];
                }
            }
            arr[i]=product;
        }


        return arr;
        
    }
}

*/