public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1,3,8};

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];
        if(prices.length < 2){
            return maxProfit;
        }

        for(int i = 1; i<prices.length;i++){
            if(prices[i] <= buyPrice){
                buyPrice = prices[i];
            }else{
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}
