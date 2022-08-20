package array1;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {2,6,8,5,4,3};
		int[] arr2= {2,3,4,7};
		
		int i,j;
		
		for(i=0;i<arr1.length;i++){
			
			for(j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arr2[j]=Integer.MIN_VALUE;
					System.out.print(arr1[i]+" ");
				}
			}
		}

	}

}
