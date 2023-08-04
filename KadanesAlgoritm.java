package array;

public class KadanesAlgoritm {
	public static void sum(int arr[]) {
		int ms= Integer.MIN_VALUE;
		int cs=0;
		for(int i=0;i<arr.length;i++) {
			cs = cs+arr[i];
			System.out.println("cs"+cs);
		
			if(cs<0) {
				cs=0;
			
			}
			ms= Math.max(cs, ms);
		}
			System.out.print(ms);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {-2,-3,4,-2,1,5,6};
sum(arr);
	}

}
