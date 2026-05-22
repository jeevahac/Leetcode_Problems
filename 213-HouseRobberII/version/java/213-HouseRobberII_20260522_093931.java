// Last updated: 5/22/2026, 9:39:31 AM
1class Solution {
2
3    public static int sp_rob(int arr[]){
4        
5        // Base
6        
7        int prev= arr[0];
8        int prev2= 0;
9   
10        
11        for(int i=1;i<arr.length;i++){
12            
13            int pick = arr[i]+ prev2;
14            
15            int notpick= 0 + prev;
16            
17            int curr= Math.max(pick,notpick);
18            
19            // Important
20            
21            prev2=prev;
22            prev=curr;
23        }
24        
25        return prev;  
26        
27    }
28    public int rob(int[] arr) {
29
30        int n=arr.length;
31
32        // Handle edge cases
33        if (n == 0) return 0;
34        if (n == 1) return arr[0];
35
36        // Leaving first element 
37        int temp1[]=new int[n-1];
38        int temp2[]=new int[n-1];
39
40        int t1i=0;
41        int t2i=0;
42
43        for(int i=0;i<n;i++){
44            
45            //Leaving first element and storing it in the temp1 array
46            if(i!=0){
47                temp1[t1i++]=arr[i];
48            }
49            //Leaving last element and storing it in the temp2 array
50            if(i!=n-1){
51                temp2[t2i++]=arr[i];
52            }
53        }
54
55        return Math.max(sp_rob(temp1), sp_rob(temp2));
56
57
58        
59    }
60}