// Last updated: 8/28/2025, 11:40:25 AM
class Solution {

     public static int get_first_digit(int num){
        
        while(num>=10){
            num=num/10;
        }
        
        return num;
    }
    
    public static int gcd(int a,int b){
        
        if(a==0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }
    
    public int countBeautifulPairs(int[] arr) {
        
         int count=0;
        
        for(int i=0;i<arr.length;i++){
            
            int first_digit=get_first_digit(arr[i]);
            
            for(int j=i+1;j<arr.length;j++){
                
                int last_digit=arr[j]%10;
                
                if(gcd(first_digit,last_digit)==1){
                    count++;
                }
            }
        }
        
        return count;
        
    }
}