// Last updated: 7/24/2025, 9:25:38 PM
class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp_list=new ArrayList<>(); 
        set(result,new ArrayList<>(),arr,0);
        return result;
    }
    public static void set(List<List<Integer>> r,List<Integer> tl, int arr[],int s){
        r.add(new ArrayList<>(tl));

        for(int i=s;i<arr.length;i++){
            tl.add(arr[i]);
            set(r,tl,arr,i+1);
            tl.remove(tl.size()-1);
        }
    }
}