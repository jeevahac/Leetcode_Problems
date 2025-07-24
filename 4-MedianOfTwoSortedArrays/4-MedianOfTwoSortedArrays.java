// Last updated: 7/24/2025, 9:26:09 PM
class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {

        int arr3[]=new int[arr1.length+arr2.length];

        int k=0;
        for(int i=0;i<arr1.length;i++){
            arr3[k++]=arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            arr3[k++]=arr2[i];
        }

        Arrays.sort(arr3);
        

        int mid=(arr3.length)/2;

        if(arr3.length%2==1){
            return (double) arr3[mid];
        }
        else{
            
            return (double) ( (arr3[mid-1]+arr3[mid]) )/2;
        }
      

    }
}