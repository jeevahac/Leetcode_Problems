// Last updated: 7/30/2025, 4:32:32 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
}