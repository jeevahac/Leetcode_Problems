// Last updated: 7/24/2025, 9:24:11 PM
class Solution {

    public static int hamming(int n){
        int count=0;
        while(n!=0){
            count=count+(n&1);
            n=n>>1;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int hamI = hamming(arr[i]);
                int hamJ = hamming(arr[j]);

                if( hamI>hamJ || hamI==hamJ && arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
        
    }
}