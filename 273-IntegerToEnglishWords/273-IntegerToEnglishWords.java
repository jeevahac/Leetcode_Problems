// Last updated: 7/24/2025, 9:24:47 PM
class Solution {
    public String numberToWords(int num) {
        String ones[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String teens[]={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String tens[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        
        String words="";
        
        if(num==0){
            return "Zero";
        }
        
        if (num >= 1000000000) {
            words += numberToWords(num / 1000000000) + " Billion ";
            num %= 1000000000;
        }

        if (num >= 1000000) {
            words += numberToWords(num / 1000000) + " Million ";
            num %= 1000000;
        }
        
        if (num >= 1000) {
            words+=numberToWords(num / 1000)+" Thousand ";
            num %= 1000;
        }
        
        if(num>=100){
            words=words+ones[num/100]+" Hundred ";
            num=num%100;

        }
        
        if(num>=20){
            words=words+tens[num/10];
            num=num%10;
            if(num>0){
                words=words+" "+ones[num];
            }
        }
        
        else if(num>=10){
            words=words+teens[num-10];
        }
        else if(num>0){
            words=words+ones[num];
        }
        
        return words.trim();
    }
}