package searchingandsorting;

public class Sort_0_1_2 {
	public static void sort_0_1_2(int[] arr) {
		int n=arr.length;
		int i=0;
		int zeroPointer=0;
		int twoPointer=n-1;
		
		while(i<=twoPointer) {
			if(arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[zeroPointer];
				arr[zeroPointer]=temp;
				zeroPointer++;
				i++;
			}
			else if(arr[i]==2) {
				int temp=arr[i];
				arr[i]=arr[twoPointer];
				arr[twoPointer]=temp;
				twoPointer--;
			}
			else {
				i++;
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
		int[] arr= {0,1,2,0,1,2,0};
		sort_0_1_2(arr);
		printArray(arr);

	}

}
