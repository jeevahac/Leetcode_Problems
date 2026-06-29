// Last updated: 6/29/2026, 6:40:59 PM
1class Solution {
2    public String minWindow(String str, String t) {
3
4        int l=0,r=0,count=0, min_length=Integer.MAX_VALUE, start_index=-1,n=str.length();
5        
6        int hash[]=new int[256];
7        
8        for(int i=0;i<t.length();i++){  // Pre inserting the t string characters in the hash map
9            hash[t.charAt(i)]++; 
10        }
11        
12        while(r<n){
13            
14            if(hash[str.charAt(r)] > 0){ // that means it got one single character in the str so increment the count;
15                count++;
16            }
17            
18             hash[str.charAt(r)]--; 
19            
20            while(count==t.length()){ // this is the possible answer where we got all t strings in the hash 
21                
22                if(r-l+1<min_length){
23                    min_length=r-l+1;
24                    start_index=l;
25                    
26                }
27                
28                hash[str.charAt(l)]++;
29                    
30                if(hash[str.charAt(l)]>0){
31                    count--;
32                }
33                
34                
35                l++;
36            }
37            
38            r++;
39        }
40        
41        return start_index==-1? "" : str.substring(start_index,start_index+min_length);
42        
43    }
44}