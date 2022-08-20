package array1;

public class SumOfArrayElem {
	
	public static int sumOfArrayElem(int[] arr) {
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum +=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,6,4,2,3,5,6,};
		
		System.out.println(sumOfArrayElem(arr));

	}

}
