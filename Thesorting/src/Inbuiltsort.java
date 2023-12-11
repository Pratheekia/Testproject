import java.util.Arrays;
import java.util.Scanner;

public class Inbuiltsort {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
     System.out.println("Enter the size of array");
     //creating an array
     int [] arr=new int[scan.nextInt()];
     for(int i=0; i<=arr.length-1; i++)
     {
    	 System.out.println("Enter the number to be sorted" + (i+1));
    	 arr[i]=scan.nextInt();
    	  }
     //printing the array before sorting
     System.out.println(" arrays before sorting");
     for(int i=0; i<=arr.length-1; i++)
     {
    	 System.out.println(arr[i] + " ");
     }
    //sorting array using inbuilt method- array.sort()	
     Arrays.sort(arr);
   //printing the array after sorting
     System.out.println(" arrays after sorting");
     for(int  i=0; i<=arr.length-1; i++)
     {
    	 System.out.println(arr[i] + " ");
     }
	}

}
