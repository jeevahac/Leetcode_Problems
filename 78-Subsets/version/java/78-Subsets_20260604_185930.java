// Last updated: 6/4/2026, 6:59:30 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] arr) {
3        
4          
5        int n= arr.length;
6        
7        List<List<Integer>> ans= new ArrayList<>();
8        
9        
10        for(int num=0; num < (1<<n); num++){ // (1<<num) which is 2^3=8 => 0-7 (iteration goes)
11            
12            List<Integer> ds= new ArrayList<>();
13            
14            for(int i=0;i<n;i++){
15                
16                if((num & (1<<i))!=0){
17                    ds.add(arr[i]);
18                }
19            }
20            
21            ans.add(ds);
22            
23        }
24        
25        return ans;
26    }
27}