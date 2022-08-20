package searchingandsorting;

public class BinarySearch {
	
	public static int binarySearch(int[] arr,int x) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			else if(x<arr[mid])
				end=mid-1;
			else
				start =mid+1;
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,7,9,11,12,45};
		int x=9;
		System.out.println(binarySearch(arr,x));

	}

}
