// Last updated: 6/25/2026, 6:28:52 PM
1class Solution {
2
3    public static int func(int arr[], int k){
4        
5        if(k<0){ // Edge case 
6            return 0;
7        }
8        
9        int r=0,l=0,n=arr.length,sum=0,count=0;
10        
11        while(r<n){ // while loop because we are considering previuos value also which gives the sum as k so you while not if here
12            
13            sum+=arr[r];
14            
15            while(sum>k){
16                sum-=arr[l];
17                l++;
18            }
19            
20            if(sum<=k){
21                count=count+(r-l+1);
22            }
23            
24            r++;
25        }
26        
27        return count;
28    }
29    public int numSubarraysWithSum(int[] arr, int k) {
30        
31        int ans=func(arr,k)- func(arr,k-1);
32		 return ans;
33    }
34}