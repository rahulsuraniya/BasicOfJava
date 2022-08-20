package array1;

public class SwapAlternative {
	
	public static void swapAlternate(int[] arr) {
		for(int i=0;i<arr.length-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		swapAlternate(arr);
		printArr(arr);

	}

}
