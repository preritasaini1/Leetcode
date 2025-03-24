class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        // Means we have to buy the shares at i - 1 day and sell on i to genearte maximum profit..
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        
        return profit;
    }
}