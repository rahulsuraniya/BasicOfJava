package searchingandsorting;

public class CheckArrayRotation {
	
	public static int checkRotation(int[] arr) {
		 int n = arr.length;
			int index = 0;
			for(int i = 0; i < n-1; i++) {
				if(arr[i] > arr[i+1]) {
					index = i+1;
				}
			}
			return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,6,1,2,3,4};
		System.out.println(checkRotation(arr));

	}

}
