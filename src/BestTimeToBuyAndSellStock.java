import java.util.Iterator;

import javax.xml.transform.Templates;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		/*
		 * You are given an array prices where prices[i] is the price of a given stock
		 * on the ith day.
		 * 
		 * You want to maximize your profit by choosing a single day to buy one stock
		 * and choosing a different day in the future to sell that stock.
		 * 
		 * Return the maximum profit you can achieve from this transaction. If you
		 * cannot achieve any profit, return 0.
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1)
		 * and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2
		 * and selling on day 1 is not allowed because you must buy before you sell.
		 * Example 2:
		 * 
		 * Input: prices = [7,6,4,3,1] Output: 0 Explanation: In this case, no
		 * transactions are done and the max profit = 0.
		 */
		int[] trades = { 7, 1, 5, 3, 6, 4 };
		int bestBuy = maxProfit(trades);
		System.out.println(bestBuy);
	}

	public static int maxProfit(int[] prices) {
		// assuming the current best buy is - 0
		int bestBuy = 0;
		// assigning the "temp" best sale to be the first element of the array.
		int buyPrice = prices[0];

		for (int i = 1; i < prices.length; i++) {
			// comparing elements in the array with the first element
			// if current price minus comparing price is bigger than bestBuy then make it
			//finding the highest profit by iterating through the array and subtracting the buy price.
			//then compare it with the current best buy price.
			if (bestBuy < prices[i] - buyPrice) {
				bestBuy = prices[i] - buyPrice;
			}
			// finding the lowest buy price
			if (buyPrice > prices[i]) {
				buyPrice = prices[i - 1];
			}
		}
		return bestBuy;
	}
}
