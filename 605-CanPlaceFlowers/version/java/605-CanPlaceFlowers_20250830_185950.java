// Last updated: 8/30/2025, 6:59:50 PM
class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {

        int count=0;
        int len=arr.length;
       
       for(int i=0;i<len;i++){
            if(arr[i]==0){

                int left=(i==0)?0:arr[i-1];
                int right=(i==len-1)?0:arr[i+1];

                if(left==0 && right==0){
                    arr[i]=1;
                    count++;

                    if(count>=n){
                        return true;
                    }
                }
            }
       }

       return count>=n;
        
    }
}