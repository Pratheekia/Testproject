package Array;
import java.util.Scanner;
public class Array5 {       

	public static void main(String[] args) {
		
    Scanner scan = new Scanner (System.in);
    System.out.println("enter the no of subjects");
    
    int subjects =scan.nextInt();
   // creating
    String [] arr= new String [subjects];
    
    //storing the array, subject names
    for(int i=0; i<=arr.length-1;i++ )
    {
    	System.out.println("enter the subjects name-"+(i+1));
    	arr[i] =scan.next();
    	  }
    //Display the percentage
    
    for(int i=0; i<=arr.length-1;i++ )
    {
    	System.out.println(" the name of subjects -" + (i+1)+ " is "+ arr[i]);
    }
	}

}
