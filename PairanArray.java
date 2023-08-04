package array;

public class PairanArray {
	public static void pair(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int curr = arr[i];
			for(int j=0;j<arr.length;j++) {
				System.out.print("("+curr+","+arr[j]+")");
			}
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,8};
		pair(arr);

	}

}
