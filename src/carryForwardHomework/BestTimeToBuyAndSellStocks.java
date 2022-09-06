package carryForwardHomework;

public class BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {
//		int A[] = {1,2};
//		int A[] = {2,1};
		int A[] = {};
 		System.out.println(maxProfit(A));
	}

	public static int maxProfit(final int[] A) {
		if (A.length == 0)
			return 0;
		int B[] = A;
		int maxProfit = 0;
		int currentMaxValue = B[B.length-1];

		for (int i = B.length - 2; i >=0; i--) {
			if (B[i] < currentMaxValue) 
				maxProfit = Math.max(maxProfit, currentMaxValue - B[i]);
			else
				currentMaxValue = B[i];
		}
		return maxProfit;
	}

	public static int maxProfitBruteForce(final int[] A) {
		int maxProfit = 0;
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;

		int B[] = A;
		if (A.length == 0)
			return 0;

		for (int i = 0; i < B.length; i++) {
			if (B[i] > maxValue)
				maxValue = B[i];
		}
		for (int i = 0; i < B.length; i++) {
			if (B[i] < minValue)
				minValue = B[i];
		}
		for (int i = 0; i < B.length; i++) {
			for (int j = i; j < B.length; j++) {
				if (B[i] < B[j])
					maxProfit = Math.max(maxProfit, B[j] - B[i]);
			}
		}
		return maxProfit;
	}
}
