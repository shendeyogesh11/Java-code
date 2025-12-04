package oops;

public class StockBuyNSell {
	
	public static void main(String[] args) {
	int[] arr = {2,5,9,3,8};
	
	int result = maxProfit( arr);
	System.out.println("max profit is: " + result);
		
	}

	private static int maxProfit(int[] arr) {
		
		if(arr.length <= 1) {
			return 0;
		}
		
		int minPrice = arr[0];
		int maxProfit = 0;
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i] < minPrice) {
				minPrice = arr[i];
			}
			
			
			int profit = arr[i] - minPrice;
			
			
			if(profit > maxProfit) {
				maxProfit = profit;
			}
			
		}
		
		return maxProfit;
	}
	
	
	
	

}
