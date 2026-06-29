// Last updated: 6/29/2026, 7:03:09 PM
1class Solution {
2    public int[] twoSum(int[] arr, int target) {
3
4        Map<Integer, Integer> map=new HashMap<>();
5
6        for(int i=0;i<arr.length;i++){
7
8            int comp=target-arr[i];
9
10            if(map.containsKey(comp)){
11                return new int[]{i, map.get(comp)};
12            }
13
14            map.put(arr[i],i);
15        }
16
17        return new int[]{-1 ,-1};
18        
19    }
20}