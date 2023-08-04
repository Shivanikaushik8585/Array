package array;

public class BinarySearch {
	public static int binarySrc(int arr[],int key) {
	int start = 0;
	int last  = arr.length-1;
	while(start<=last) {
		int mid =  (start+last)/2;
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[mid]<key) {
			start = mid+1;
		}
		else {
			last=mid-1;
		}
	}
	return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,4,7,9,10,23};
System.out.print(binarySrc(arr,9));
	}

}
//time complexity O(logn);
