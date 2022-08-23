package searchingandsorting;

public class InsertionSort {
	
	public static void sortArray(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,13,4,1,3,6,28};
		sortArray(arr);
		printArray(arr);

	}

}
