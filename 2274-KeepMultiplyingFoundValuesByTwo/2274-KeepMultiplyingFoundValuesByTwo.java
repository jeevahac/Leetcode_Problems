// Last updated: 7/24/2025, 9:24:07 PM
class Solution {
    public int findFinalValue(int[] nums, int original) {

        while(true){

            int flag=0;
            for(int num:nums){
                if(num==original){
                    original=original*2;
                    flag=1;
                    break;
                }
            }

            if(flag==0){
                break;
            }
        }
        return original;

    }
}