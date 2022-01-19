package applications;


//import java.util.function.*;

public class MaxProfit {
	
	
	public int BestProfit(int[] prices) {
		
		int leftPointer = 0; //This pointer is when we will buy the stock.
		int rightPointer = 1; //This pointer is when we plan to sell the stock
		int MaxProfit = 0; //storing the highest amount of profit.
		
		while(rightPointer < prices.length) {
			
			//profitable?
			
			if(prices[leftPointer] < prices[rightPointer]) {
			
				int profit = prices[rightPointer] - prices[leftPointer];
				
				if(profit > MaxProfit) {MaxProfit = profit;}
				
				rightPointer++;
			}
			
			else { leftPointer = rightPointer;}
			
			rightPointer++;
		}
		
		
		return MaxProfit;
	}
	
	public static void main(String[] args) {
		
		MaxProfit a = new MaxProfit();
		
		int[] list = {7,1,5,3,6,4} ;
		
		System.out.println(a.BestProfit(list));
		
	}
	
}
