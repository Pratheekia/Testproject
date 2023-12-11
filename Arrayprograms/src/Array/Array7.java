package Array;
import java.util.Scanner;
public class Array7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of semester:");
		int n = scan.nextInt();
		// Creating the array
		String[] arr = new String[n];
		// store the semester backlogs 
		for( int i=0;i<=arr.length-1;i++)
		{
			System.out.println(" is there backlogs in semester-:"+(i+1)); //say true or false as input
			boolean res =scan.nextBoolean();
		    if(res ==true)
		    {
		    	arr[i]="yes";
		    }
		    else
		    {
		    	arr[i] ="No";
		    }
		}
		// display the semester backlogs +
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(" the backlogs in  semester-"+(i+1)+"is"+arr[i]);
			
				
		}

	}

}
