/*
 * Sample Input 1:
1
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
 */
package array1;

public class Sort_0_1 {
	
	public static void sort_0_1(int[] arr) {
		int n=arr.length;
		int i=0;
		int j=n-1;
		while(i<=j) {
			if(arr[i]==1 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else if(arr[i]==1 && arr[j]==1) {
				j--;
			}
			else if(arr[i]==0 && arr[j]==0) {
				i++;
			}
			else if(arr[i]==0 && arr[j]==1) {
				i++;
				j--;
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,1,0,1,0,1};
		
		printArray(arr);
		
		sort_0_1(arr);
		printArray(arr);

	}

}
