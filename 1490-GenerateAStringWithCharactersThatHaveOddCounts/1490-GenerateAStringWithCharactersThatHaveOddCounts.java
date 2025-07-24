// Last updated: 7/24/2025, 9:24:08 PM
class Solution {
    public String generateTheString(int n) {

        StringBuilder sb=new StringBuilder();
        if(n%2==0){ //Even number
            for(int i=0;i<n-1;i++){
                sb.append('a');
            }
            sb.append('b');
        }
        else{
            for(int i=0;i<n;i++){
                sb.append('a');
            }
        }
        
        return sb.toString();
    }
}