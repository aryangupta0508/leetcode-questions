class Solution {
    public int maxProfit(int[] prices) {
        
     int previousPrice = prices[0];
     int profit = 0;

     for (int i = 1; i < prices.length; i++) {
          int currentPrice = prices[i];

        if (currentPrice > previousPrice) {
        profit += currentPrice - previousPrice;
    }
        previousPrice = currentPrice;

    }
          return profit;
    }
}