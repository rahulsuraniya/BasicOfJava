package searchingandsorting;

public class RotateArray {

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void rotateArray(int[] arr,int d) {
		 int l = arr.length;
	        int[] arr2 = new int[d];
	        for(int i=0;i<d;i++) {
	            //will copy elements upto d in a new array
	            arr2[i] = arr[i];
	        }
	        for(int i=0;i<l-d;i++) {
	            //will shift elements to 0th index in the orginal array starting from d
	            arr[i] = arr[i+d];
	        }
	        int i = l - d;
	        int j = 0;
	        //will copy back the elements in the original array that was duplicated in second array upto d
	        while(i<l) {
	            while(j<d) {
	                arr[i] = arr2[j];
	                i++; j++;
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int rotateBy=2;
		rotateArray(arr,rotateBy);
		printArray(arr);

	}

}
