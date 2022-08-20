package array1;

public class PrimitiveandNonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		increment(i);
		System.out.println(i); //output will be 10 
		
		int[] arr= {1,2,3,4,5};
		System.out.println(arr+" main");
		incrementArray(arr);
		printArray(arr);

	}

	private static void incrementArray(int[] input) {
		// TODO Auto-generated method stub
		System.out.println(input+" incre");
		for(int i=0;i<input.length;i++) {
			input[i]=input[i]+1;
		}
		
	}
	
	public static void printArray(int[] arr) {
		System.out.println(arr+" print");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void increment(int i) {
		// TODO Auto-generated method stub
		i++;
		
	}

}
