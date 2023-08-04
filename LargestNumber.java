package array;

public class LargestNumber {
	public static int largestNum(int arr[]) {
		int min = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(min<arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	public static int SmallestNum(int arr[]) {
		int max = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max>arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,6,2,8};
		System.out.println("Small No:"+SmallestNum(arr));
		System.out.println("Large No:"+largestNum( arr));
	}

}
