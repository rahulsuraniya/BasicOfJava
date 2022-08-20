package array1;

public class FindDuplicate {
	
	public static int findDuplicate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int j;
			for(j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]==arr[j])
						return arr[i];
				}
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,7,2,5,4,7,1,3,6};
		System.out.println(findDuplicate(arr));

	}

}
