package array;

public class MaxSubarray {
	public static void maxSubarray(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int curr =0;
		for(int i=0;i<arr.length;i++) {
			for(int  j=0;j<arr.length;j++) {
				curr=0;
				for(int k= i;k<=j;k++) {
//					System.out.print(arr[k]);
					curr+= arr[k];
				}
				System.out.println("Curr:"+curr);
				if(maxSum<curr) {
					maxSum=curr;
				}
				
			}
			System.out.println();
		}
		System.out.print("maxx"+maxSum);
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,8,10};
		maxSubarray(arr);

	}

}
