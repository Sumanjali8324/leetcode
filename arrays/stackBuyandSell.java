#121. Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int low=prices[0];
        int total=0;
        int high=0;
        for(int i=1;i<prices.length;i++){
            if(low>prices[i]){
                low=prices[i];
            }
            if(low<prices[i]){
                high=prices[i]-low;
                total=Math.max(total,high);
            }
        }return total;
    }
}