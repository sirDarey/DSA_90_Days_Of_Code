
/***
 * 
 * @author Sir Darey
 * 
 * Day 36: LeetCode Problem 122 - Best Time to Buy and Sell Stock II
 */

public class Day_36_122_BestTimeToBuyAndSellStock2 {
	
	public int maxProfit(int[] prices) {
        int max = 0;

        for (int i=1; i<prices.length; i++) 
            if (prices[i] > prices[i-1])
                max += prices[i] - prices[i-1];
        
        return max;
    }
}
