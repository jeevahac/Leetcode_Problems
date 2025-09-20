// Last updated: 9/20/2025, 12:46:21 PM
class Solution {
    public List<Integer> getRow(int i) {
        
         
            
            long val=1;
            List<Integer> row_ans=new ArrayList<>();

            for(int k=0;k<=i;k++){
                row_ans.add((int) val);
                val= val*(i-k)/(k+1);
            }
            
        
        return row_ans;


    }
}