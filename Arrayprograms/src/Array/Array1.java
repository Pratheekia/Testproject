package Array;
import java.util.Scanner;
public class Array1 {       //assignment prob

	public static void main(String[] args) {
	double [] arr = new double[7];
    Scanner scan = new Scanner (System.in);
    System.out.println("enter the percentage");
    //storing the array
    for(int i=0; i<=arr.length-1;i++ )
    {
    	arr[i] =scan.nextDouble();
    	  }
    //Display the percentage
    System.out.println("the percentages are");
    for(int i=0; i<=arr.length-1;i++ )
    {
    	System.out.print(arr[i] + " , " );
    }
	}

}
