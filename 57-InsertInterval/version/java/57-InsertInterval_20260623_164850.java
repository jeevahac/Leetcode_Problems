// Last updated: 6/23/2026, 4:48:50 PM
1class Solution {
2    public int[][] insert(int[][] arr, int[] newinterval) {
3        int i=0;
4        int n=arr.length;
5
6        List<int[]> al=new ArrayList<>();
7
8        while(i<n && arr[i][1]< newinterval[0]){
9            al.add(arr[i]);
10            i++;
11        }
12
13        while(i<n && arr[i][0]<=newinterval[1]){
14            newinterval[0]= Math.min(newinterval[0], arr[i][0]);
15            newinterval[1]=Math.max(newinterval[1], arr[i][1]);
16            i++;
17        }
18        al.add(newinterval);
19
20        while(i<n){
21            al.add(arr[i]);
22            i++;
23        }
24
25        
26
27        return al.toArray(new int[al.size()][]);
28        
29    }
30}