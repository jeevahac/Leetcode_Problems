// Last updated: 6/13/2026, 4:55:24 PM
1class Solution {
2
3     static int count=0;
4
5    public int reversePairs(int[] arr) {
6
7        int n=arr.length;
8            count = 0;   // add this
9
10        
11        merge_sort(arr,0, n-1);
12        
13        return count;
14        
15    }
16
17    public static void merge_sort(int arr[], int low, int high){
18        
19        // base condition if keeps on dividing at some point the low and high will be equal which is one single elemenet so we cant 
20        // able to divide further by recursion so stop it. 
21        
22        
23        if(low==high){
24            return;
25        }
26        
27    
28        int mid= (low+high)/2;
29    
30        merge_sort(arr, low, mid); // left side recursion(low....mid)
31        merge_sort(arr, mid+1, high);// right side recursion (mid+1.....high);
32        
33        count_pairs(arr, low, mid, high);
34        merge(arr, low, mid, high); // merge every recurive array after dividing which is [low....mid....high]
35        
36    }
37
38    public static void count_pairs(int arr[], int low, int mid, int high){
39        
40     
41        
42        int right= mid+1;
43        
44        for(int left=low;left<=mid;left++){
45            
46            while(right<=high && arr[left]> (2L*arr[right])){
47                right++;
48            }
49            count+=(right- (mid+1) );
50        }
51       
52    }
53    
54    public static void merge(int arr[], int low, int mid, int high){
55    
56    
57    List <Integer> temp = new ArrayList<>();
58    //[low... mid]
59    // [mid+1....high]
60    
61    int left=low;
62    int right= mid+1;
63    
64    while(left<= mid && right<=high){
65        
66        if(arr[left]<=arr[right]){
67            temp.add(arr[left]);
68            left++;
69        }
70        else{
71            temp.add(arr[right]);
72           
73            right++;
74        }
75    }
76    
77    // Reamining elemenets
78    
79    while(left<=mid){
80        temp.add(arr[left]);
81        left++;
82    }
83    
84    while(right<= high){
85        temp.add(arr[right]);
86        right++;
87    }
88    
89    for(int i=low;i<=high;i++){
90        arr[i]=temp.get(i-low);  // During merging arr[low]=low-low=> [0]   Initiating to 0 index of temp to get that element correctly
91                                //                 arr[low+1]= low+1-low [1] --> next iteration
92                                //                 arr[low+2]= low+2-low [2] --> next iteration
93    }
94    
95
96    
97}
98}