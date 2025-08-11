// Last updated: 8/11/2025, 7:48:35 PM
class Solution {
    public int bitwiseComplement(int n) {

        if(n==0){
            return 1;
        }
        String res="";
        
        while(n>0){
            
            if(n%2==1){
                res='1'+res;
            }
            else{
                res='0'+res;
            }
            n=n/2;
        }

        String compliment="";

        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='1'){
                compliment+=0;
            }
            else{
                compliment+=1;
            }
        }

        
         int pow=1;
        int f_res=0;
        for(int i=compliment.length()-1;i>=0;i--){
            if(compliment.charAt(i)=='1'){
                f_res=f_res+pow;
            }
            pow=pow*2;
        }
        
        return f_res;
    }
}