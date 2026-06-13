// Last updated: 6/13/2026, 10:44:32 AM
1class Solution {
2
3     public static void merge_sort(int arr[], int low, int high){
4        
5        // base condition if keeps on dividing at some point the low and high will be equal which is one single elemenet so we cant 
6        // able to divide further by recursion so stop it. 
7        if(low==high){
8            return;
9        }
10        
11    
12        int mid= (low+high)/2;
13    
14        merge_sort(arr, low, mid); // left side recursion(low....mid)
15        merge_sort(arr, mid+1, high);// right side recursion (mid+1.....high);
16    
17        merge(arr, low, mid, high); // merge every recurive array after dividing which is [low....mid....high]
18    }
19
20    public static void merge(int arr[], int low, int mid, int high){
21    
22    List <Integer> temp = new ArrayList<>();
23    //[low... mid]
24    // [mid+1....high]
25    
26    int left=low;
27    int right= mid+1;
28    
29    while(left<= mid && right<=high){
30        
31        if(arr[left]<=arr[right]){
32            temp.add(arr[left]);
33            left++;
34        }
35        else{
36            temp.add(arr[right]);
37            right++;
38        }
39    }
40    
41    // Reamining elemenets
42    
43    while(left<=mid){
44        temp.add(arr[left]);
45        left++;
46    }
47    
48    while(right<= high){
49        temp.add(arr[right]);
50        right++;
51    }
52    
53    for(int i=low;i<=high;i++){
54        arr[i]=temp.get(i-low);
55    }
56    }
57
58
59    public static int[] sortArray(int[] arr) {
60        
61        int n= arr.length;
62        merge_sort(arr, 0 , n-1);
63
64        return arr;
65    }
66}