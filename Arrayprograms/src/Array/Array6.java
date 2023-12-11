package Array;
import java.util.Scanner;
public class Array6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of semester:");
		int n = scan.nextInt();
		// Creating the array
		boolean[] arr = new boolean[n];
		// store the semester backlogs 
		for( int i=0;i<=arr.length-1;i++)
		{
			System.out.println(" Enter the  backlogs in semester-:"+(i+1));
			arr[i] =scan.nextBoolean();
		}
		// display the semester backlogs +
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(" the backlogs in  semester-"+(i+1)+"is"+arr[i]);
			
				
		}

	}

}
