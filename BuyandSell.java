package array;

public class BuyandSell {
	public static int  buysell(int arr[]) {
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit=0;
		for(int i=0;i<arr.length;i++) {
			if(buyPrice<arr[i]) {
			int profit = arr[i]-buyPrice;
			maxProfit= Math.max(maxProfit, profit);
			
			}
		
		else {
			buyPrice = arr[i];
		}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {7,11,5,3,6,4};
System.out.print(buysell(arr));
	}

}
