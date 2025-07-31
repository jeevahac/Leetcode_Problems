// Last updated: 7/31/2025, 1:23:53 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr=new ArrayList<>();

        for(int num:nums1){
            arr.add(num);
        }
        for(int num:nums2){
            arr.add(num);
        }

        int res[]=new int[arr.size()];

        int count=0;
        for(int num: arr){
            res[count]=num;
            count++;
        }

        Arrays.sort(res);

        double ans=0;

        int mid=res.length/2;

        if(res.length%2==0){
            ans=(double) (res[mid-1]+res[mid])/2.0;
        }
        else{
            ans=(double) (res[mid]);
        }

        return ans;

        
    }
}