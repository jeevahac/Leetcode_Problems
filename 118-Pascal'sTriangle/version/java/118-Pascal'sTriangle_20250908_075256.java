// Last updated: 9/8/2025, 7:52:56 AM
class Solution {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>> res=new ArrayList<>();

        for(int i=0;i<n;i++){
            // for(int j=0;j<n-i-1;j++){
            //     System.out.print(" ");
            // }

            int val=1;
            List<Integer> row_ans=new ArrayList<>();
            for(int k=0;k<=i;k++){
                row_ans.add(val);
                val=val*(i-k)/(k+1);
            }
            res.add(row_ans);
        }

        return res;
    }
}