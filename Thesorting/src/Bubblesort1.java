import java.util.Scanner;

public class Bubblesort1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int arr [] =new int [scan.nextInt()];
	     for(int i=0;i<=arr.length-1;i++) {
	    	 System.out.println("Enter the number to be stored" +(i+1));
	    	 arr[i]=scan.nextInt();
	     }
	     System.out.println("before sorting the array is");
	     for(int i=0;i<=arr.length-1;i++) {
	    	 System.out.println(arr[i] +" ");
	     }
	     System.out.println();
	     int [] sortedArr=Bubblesort1App.bubbleSorting(arr);
	     System.out.println(" After sorting the array is");
	     for(int i=0;i<=arr.length-1;i++) {
	    	 System.out.println(arr[i] +" ");
	     }
	}

}
