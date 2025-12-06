// Last updated: 12/6/2025, 5:39:15 PM
1class Solution {
2    public boolean check(int[] arr) {
3        
4        int count = 0;
5        int n=arr.length;
6
7        for(int i=0;i<n;i++){
8            if(arr[i]> arr[ (i+1)%n ] ){
9                count++;
10            }
11
12            if(count>1){
13                return false;
14            }
15        }
16
17        return true;
18    }
19}