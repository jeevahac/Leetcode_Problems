// Last updated: 6/30/2026, 2:06:31 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] arr) {
3
4        int n=arr.length;
5        
6        Arrays.sort(arr);
7        
8        List<List<Integer>> al=new ArrayList<>();
9        
10        
11        for(int i=0;i<n;i++){
12            
13            if(i>0 && arr[i]==arr[i-1]) continue; // Iterating if it haves an duplicate values
14            
15            int j=i+1;
16            int k=n-1;
17            
18            while(j<k){
19                
20                int sum=arr[i]+arr[j]+arr[k];
21                
22                if(sum<0){
23                    j++;
24                }
25                else if(sum>0){
26                    k--;
27                }
28                else{ // if it is equal to 0 (i.e) we finded the triplet
29                    List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
30                    
31                    al.add(temp);
32                    j++;
33                    k--;
34                    
35                    while(j<k && arr[j]==arr[j-1])  j++;
36                    while(j<k && arr[k]==arr[k+1])  k--;
37                }
38            }
39            
40            
41            
42        }
43        
44        return al;
45        
46    }
47}