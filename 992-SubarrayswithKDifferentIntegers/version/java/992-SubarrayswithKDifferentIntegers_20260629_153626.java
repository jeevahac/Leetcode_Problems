// Last updated: 6/29/2026, 3:36:26 PM
1class Solution {
2
3    public static int func(int arr[], int k){
4        
5        int count=0,l=0, r=0, n=arr.length;
6        
7        Map<Integer, Integer> map=new HashMap<>();
8        
9        while(r<n){
10            
11            int num=arr[r];
12            map.put(num, map.getOrDefault(num, 0)+1);
13            
14            while(map.size()>k){
15                
16                int lnum=arr[l];
17                map.put(lnum, map.get(lnum)-1);
18                
19                if(map.get(lnum)==0){
20                    map.remove(lnum);
21                }
22                l++;
23            }
24            
25            if(map.size()<=k){
26                
27                count=count+ (r-l+1);
28            }
29            
30            r++;
31        }
32       
33        
34        
35        return count;
36    }
37    public int subarraysWithKDistinct(int[] arr, int k) {
38
39        return func(arr, k)- func(arr, k-1);
40        
41    }
42}