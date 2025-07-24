// Last updated: 7/24/2025, 9:24:35 PM
class Solution {
    public List<String> fizzBuzz(int n) {

        List <String> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){

            if((i%3==0)&&(i%5==0)){
                arr.add("FizzBuzz");
            }
            else if(i%3==0){
                arr.add("Fizz");
            }
            else if(i%5==0){
                arr.add("Buzz");
            }
            else{
                String temp=Integer.toString(i);
                arr.add(temp);
            }
        }

        return arr;
        
    }
}