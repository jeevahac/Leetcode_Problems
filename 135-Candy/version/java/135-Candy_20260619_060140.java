// Last updated: 6/19/2026, 6:01:40 AM
1class Solution {
2    public int candy(int[] arr) {
3
4        
5        int i=1,n=arr.length;
6
7        int sum=1;
8
9
10        while(i<n){
11
12            if(arr[i-1]==arr[i]){ // equal numbe means 
13                sum=sum+1;
14                i++;
15                continue;
16            }
17            int peak=1;
18
19            while(i<n && arr[i-1]<arr[i]){ // low to high slope
20                peak=peak+1;
21                sum=sum+peak;
22                i++;
23            }
24
25            int down=1;
26
27            while(i<n && arr[i-1]>arr[i]){ // high to low slope
28                
29                sum=sum+down;
30                down=down+1;
31                i++;
32            }
33
34            if(down>peak){
35                sum=sum+(down-peak);
36            }
37
38
39        }
40
41        return sum;
42        
43    }
44}