package array;

public class LinearSearch {
	public static int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,9,10,6};
	System.out.print(linearSearch(arr,6));

	}

}

// Time Complexity  O(n);
 
  
