package searchingandsorting;

public class MergeArray {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] mergeArray(int[] ar1,int[] ar2) {
		int n=ar1.length;
		int m=ar2.length;
		int[] ans=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			if(ar1[i]<ar2[j]) {
				ans[k]=ar1[i];
				k++;
				i++;
			}
			else if(ar1[i]>=ar2[j]) {
				ans[k]=ar2[j];
				k++;
				j++;
			}
		}
		
		while(i<n) {
			ans[k]=ar1[i];
			k++;
			i++;
		}
		while(j<m) {
			ans[k]=ar2[j];
			k++;
			j++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,3,4,7,11};
		int[] arr2= {2,4,6,13};
		int[] arr3=mergeArray(arr1,arr2);
		printArray(arr3);

	}

}
