package array1;

import java.util.Scanner;
public class LeanerSearch {
    public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+"th index");
            arr[i]=s.nextInt();
        }
        return arr;
        
    }
    
    public static int linerSearch(int arr[], int x) {
		//Your code goes here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
           
        }
        return -1;
    }
    
    
    
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
     int[] lar=takeInput();
     System.out.println("Please enter number whose to serch");
     int x=sc.nextInt();
     System.out.println(linerSearch(lar,x));
    }
}
