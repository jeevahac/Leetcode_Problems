// Last updated: 6/23/2026, 7:01:16 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] arr) {
3
4        int n=arr.length;
5        List<int[]> al= new ArrayList<>();
6        
7        for(int i=0;i<n;i++){
8            //  Store meetings as (start_time, end_time position)
9            al.add(new int[]{arr[i][0], arr[i][1]});
10        }
11        
12        // Sort by end time
13        Collections.sort(al, (a,b)->a[1]-b[1]);
14        
15        int count=0;
16
17        
18        int freetime=Integer.MIN_VALUE;
19        //int count=0;
20        
21        for(int i[]: al){ // arr[start_time, end_time position];
22            
23            // if start time is greater than freetime means you can shedule the meeting
24            if(i[0]>=freetime){
25                
26                count++;
27                freetime=i[1];
28            }
29        }
30        
31        return n-count;
32        
33        
34        
35    }
36}