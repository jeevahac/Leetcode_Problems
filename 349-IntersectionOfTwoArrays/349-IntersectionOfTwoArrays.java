// Last updated: 7/24/2025, 9:24:40 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hash=new HashSet<>();

        for(int num: nums1){
            hash.add(num);
        }

        HashSet<Integer> intersections=new HashSet<>();

        for(int num: nums2){
            if(hash.contains(num)){
                intersections.add(num);
            }
        }

        int arr[]=new int[intersections.size()];
        int i=0;
        for(int num: intersections){
            arr[i++]=num;
        }
        return arr;


        
    }
}