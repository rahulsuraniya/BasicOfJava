package searchingandsorting;

public class SumOfTwoArrays {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void sumOfArrays(int[] ar1,int[] ar2,int[] out) {
		int carry=0;
		int i=ar1.length-1;
		int j=ar2.length-1;
		int k=out.length-1;
		
		while(i>=0 && j>=0) {
			int sum=ar1[i]+ar2[j]+carry;
			out[k]=sum%10;
			carry=sum/10;
			k--;
			i--;
			j--;
		}
		
		while(i>=0) {
			int sum=ar1[i]+carry;
			out[k]=sum%10;
			carry=sum/10;
			i--;
			k--;
		}
		
		while(j>=0) {
			int sum=ar2[j]+carry;
			out[k]=sum%10;
			carry=sum/10;
			j--;
			k--;
		}
		
		out[k]=carry;
	}
	
	public static void main(String[] args) {
		int[] arr1= {9,7,6,1};
		int[] arr2= {4,5,9};
		int[] output=new int[1 + Math.max(arr1.length, arr2.length)];
		printArray(arr1);
		printArray(arr2);
		sumOfArrays(arr1,arr2,output);
		printArray(output);
	}

}
