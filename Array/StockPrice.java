public class StockPrice {
    public static void main(String[] args) {
        int stock_price[] = {7, 1, 5, 3, 6, 4 };
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int sellday = -1, buyday = -1;

        for( int i = 0; i < stock_price.length; i++){
            // Case 1:  the time to sell the stock as buyprice is less than current stock price as it is a profit
            if(buyprice < stock_price[i]){
                int profit = stock_price[i] - buyprice;
                maxProfit = Math.max(maxProfit, profit);
                sellday = i;
            }else{
                buyprice = stock_price[i];
                buyday = i;
            }
            // case 2 it is the time to buy the stock for max profit
        }
        System.out.println("Buy day:  " + buyday);
        System.out.println("Sell day: " + sellday);
        System.out.println("Profit:  " + maxProfit);
    }
}
