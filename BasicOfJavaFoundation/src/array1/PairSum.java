package array1;

public class PairSum {
	
	public static int findPairSum(int[] arr,int x) {
		int n=arr.length;
		int i,j;
		int count=0;
		
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				if(i!=j) {
					if(arr[i]+arr[j]==x)
						count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,6,2,5,4,3,2,4};
		int x=7;
		
		System.out.println(findPairSum(arr,x));

	}

}
