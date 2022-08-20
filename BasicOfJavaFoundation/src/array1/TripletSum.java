package array1;

public class TripletSum {

	public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int count=0;
        int i,j,k;
        for(i=0;i<arr.length-2;i++){
            for(j=i+1;j<arr.length-1;j++){
                for(k=j+1;k<arr.length;k++){
                    // if(i!=j!=k){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                    }
                }
            }
         return count;
        }
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7}; 
		int x=12;
		System.out.println(findTriplet(arr,x));
	}

}
