// Last updated: 5/21/2026, 6:21:07 PM
1class Solution {
2
3    public static void findCombinations(int index, int arr[], int target, List<List<Integer>> ans, List<Integer> ds){
4
5        //Base Case
6        if(index==arr.length){
7            if(target==0){
8                ans.add(new ArrayList<>(ds));
9            }
10            return;
11        }
12
13        if(arr[index]<=target){
14            ds.add(arr[index]);
15            findCombinations(index,arr,target-arr[index],ans,ds);
16
17            ds.remove(ds.size()-1);
18        }
19        findCombinations(index+1,arr,target,ans,ds);
20    }
21    public List<List<Integer>> combinationSum(int[] candidates, int target) {
22
23        List<List<Integer>> ans=new ArrayList<>();
24
25        findCombinations(0,candidates, target, ans, new ArrayList<>());
26        
27        return ans;
28    }
29}