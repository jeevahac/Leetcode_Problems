// Last updated: 7/28/2025, 5:59:46 PM
class Solution {

     public static List<Integer> Nthrow_byformula(int n){
        
        List<Integer> ans_row=new ArrayList<>();

        int ans=1;
        ans_row.add(ans);
        
        for(int i=1;i<n;i++){
            ans=ans* (n-i);
            ans=ans/i;
            ans_row.add(ans);
        }

        return ans_row;
    }
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            ans.add(Nthrow_byformula(i));
        }

        return ans;
        
    }
}