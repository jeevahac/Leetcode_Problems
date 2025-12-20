// Last updated: 12/20/2025, 12:33:24 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3
4        ArrayList<Integer> arr=new ArrayList<>();
5
6        for(int i=0;i<m;i++){
7            arr.add(nums1[i]);
8        }
9
10        for(int j=0;j<n;j++){
11            arr.add(nums2[j]);
12        }
13
14        Collections.sort(arr);
15
16        for(int i=0;i<arr.size();i++){
17            nums1[i]=arr.get(i);
18        }
19        
20    }
21}