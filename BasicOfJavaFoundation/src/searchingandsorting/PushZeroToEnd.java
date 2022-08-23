package searchingandsorting;

public class PushZeroToEnd {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void pushZeroToEnd(int[] arr) {
		int n=arr.length;
        
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
		
		
		
		
//		int i=0;
//		int j=arr.length-1;
//		while(i<=j) {
//			if(arr[i]!=0 && arr[j]==0) {
//				i++;
//				j--;
//			}
//			else if(arr[i]==0 && arr[j]!=0) {
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				i++;
//				j--;
//			}
//			else if(arr[i]==0 && arr[j]==0) {
//				j--;
//			}
//			else if(arr[i]!=0 && arr[j]!=0) {
//				i++;
//			}
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,0,0,1,3,0,0};
		pushZeroToEnd(arr);
		printArray(arr);

	}

}
