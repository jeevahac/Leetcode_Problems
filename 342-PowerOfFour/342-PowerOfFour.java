// Last updated: 7/24/2025, 9:24:43 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }


        while(n%4==0){
            n=n/4;
        }

        return n==1;
        /*
        int left = 0;  // Start with 0 since 4^0 = 1
        int right = n/2; // Calculate the maximum possible power

        while (left <= right) {
            int mid = (left + right) / 2;
            long ans = (long) Math.pow(4, mid);

            if (ans == n) {
                return true;
            } else if (ans > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;

        */
    }
}
