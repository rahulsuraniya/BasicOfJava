package array1;
import java.util.Scanner;

public class InputOfArray {
	static Scanner sc=new Scanner(System.in);
	
	public static int[] takingInput() {
		System.out.println("Plese enter your array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("enter element of array: ");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=takingInput();
		
		printArray(arr);
		

	}

}
