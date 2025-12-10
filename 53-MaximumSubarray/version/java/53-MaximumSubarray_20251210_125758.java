// Last updated: 12/10/2025, 12:57:58 PM
1class Solution {
2    public int maxSubArray(int[] arr) {
3        
4        int sum=0;
5        int max_sum=Integer.MIN_VALUE;
6
7        for(int num: arr){
8            sum=sum+num;
9
10            if(sum>max_sum){
11                max_sum=sum;
12            }
13
14            if(sum<0){
15                sum=0;
16            }
17        }
18
19        return max_sum;
20    }
21}