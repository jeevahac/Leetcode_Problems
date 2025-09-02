// Last updated: 9/2/2025, 7:41:29 PM
class Solution {
    public boolean check(int[] arr) {
        
        int count = 0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]> arr[ (i+1)%n ] ){
                count++;
            }

            if(count>=2){
                return false;
            }
        }

        return true;
    }
}