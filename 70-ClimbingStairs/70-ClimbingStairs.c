// Last updated: 7/24/2025, 9:25:44 PM
int climbStairs(int n) {

    int arr[n+1];

    arr[0]=1;
    arr[1]=1;

    for(int i=2;i<=n;i++){
        arr[i]=arr[i-1]+arr[i-2];
    }
    return arr[n];

}