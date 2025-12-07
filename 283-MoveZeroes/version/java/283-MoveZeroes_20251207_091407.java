// Last updated: 12/7/2025, 9:14:07 AM
1class Solution {
2
3    public static void swap(int arr[],int a, int b){
4        int temp=arr[a];
5        arr[a]=arr[b];
6        arr[b]=temp;
7    }
8    public void moveZeroes(int[] nums) {
9        
10        // int arr[]=new int[nums.length];
11        // int index=0;
12        // for(int i=0;i<nums.length;i++){
13        //     if(nums[i]!=0){
14        //         arr[index++]=nums[i];
15        //     }
16        // }
17
18        // for(int i=index;i<nums.length;i++){
19        //     arr[index++]=0;
20        // }
21
22        // for(int i=0;i<nums.length;i++){
23        //     nums[i]=arr[i];
24        // }
25
26        int j=-1;
27        int n=nums.length;
28
29        for(int i=0;i<n;i++){
30            if(nums[i]==0){
31                j=i;
32                break;
33            }
34        }
35
36        // **Fix: If no zero found, array already correct** no need to swap
37        if(j == -1) return;
38
39        for(int i=j+1;i<n;i++){
40            if(nums[i]!=0){
41                swap(nums,j,i);
42                j++;
43            }
44        }
45
46    }
47}