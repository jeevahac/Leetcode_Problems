// Last updated: 7/24/2025, 9:25:32 PM
class Solution {
    public int maxProfit(int[] prices) {

         
        int minPrice = Integer.MAX_VALUE; //7 1
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // update max profit
            }
        }

        return maxProfit;
    
    /* Time limit exceeded
        int max_profit=0;

        int profit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]){
                    profit=prices[j]-prices[i];
                }
                if(profit>max_profit){
                    max_profit=profit;
                }
            }
        }

        return max_profit;

        */
        
    }
}