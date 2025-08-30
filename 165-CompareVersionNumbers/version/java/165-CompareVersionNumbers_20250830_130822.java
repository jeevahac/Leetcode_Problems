// Last updated: 8/30/2025, 1:08:22 PM
class Solution {
    public int compareVersion(String version1, String version2) {
         int i=0;
        int j=0;
        
        int v1_sum=0;
        int v2_sum=0;
        
        while(i<version1.length() || j<version2.length()){
            
            while(i<version1.length() && version1.charAt(i)!='.'){
                v1_sum=v1_sum*10+(version1.charAt(i)-'0');
                i++;
            }
            while(j<version2.length() && version2.charAt(j)!='.'){
                v2_sum=v2_sum*10+(version2.charAt(j)-'0');
                j++;
            }
            
            
            if(v1_sum<v2_sum){
                return -1;
            }
            if(v1_sum>v2_sum){
                return 1;
            }
            
            v1_sum=v2_sum=0;
            i++;
            j++;
            
        }
        
        return 0;
    }
}