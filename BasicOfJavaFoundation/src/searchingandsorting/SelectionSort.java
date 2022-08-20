package searchingandsorting;

public class SelectionSort {
	
	public static void sortArray(int[] arr) {
		int i,j;
		
		for(i=0;i<arr.length-1;i++) {
			
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
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
		int[] arr= {2,13,4,1,3,6,20};
		
		sortArray(arr);
		printArray(arr);

	}

}
