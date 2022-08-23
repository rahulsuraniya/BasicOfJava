package searchingandsorting;

public class SecondLargest {
	
	public static int secondLargest(int[] arr) {
	    int l= Integer.MIN_VALUE;
		int S= Integer.MIN_VALUE;
		int val= 0;
		
		for (int i=0; i<arr.length; i++) {
			if( arr[i] > l){
				val = l;
				l = arr[i];
			}
			if(arr[i] != l) {
			if ( arr[i] > S) {
					S= arr[i];
				}
			}
			if (val > S) {
				S= val;
	            i++;
			}
		}
		
		return S;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,13,4,1,3,6,20};
		System.out.println("Second largest element is: "+secondLargest(arr));

	}

}
