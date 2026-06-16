// Last updated: 6/16/2026, 5:29:29 PM
1class Solution {
2
3    public boolean checkValidString(String str) {
4        // Instead of count we are using range values by min, max
5        
6        int min=0;
7        int max=0;
8        
9        for(int i=0;i<str.length();i++){
10            
11            if(str.charAt(i)=='('){
12                min=min+1;
13                max=max+1;
14            }
15            else if(str.charAt(i)==')'){
16                min=min-1;
17                max=max-1;
18            }
19            else{ // which is '*'
20                min=min-1;
21                max=max+1;
22            }
23            
24            if(min<0){
25                min=0; // At any moment if min goes lesser than 0 re initialize to 0 again
26            }
27            if(max<0){ // max should always be greater than 0 else false;
28                return false;
29            }
30            
31        }
32        
33        return (min==0); // Atlast check the min value is 0;
34    }
35}