// Last updated: 7/24/2025, 9:24:39 PM
class Solution {
    public boolean isPerfectSquare(int num) {

        if(num==1){
            return true;
        }

        int left=1;
        int right=num/2;

        while(left<=right){
            int mid=(left+right)/2;

            long square=(long)mid*mid;

            if(square==num){
                return true;
            }
            else if(square>num){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        return false;
        
    }
}