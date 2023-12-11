package Array;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the names of employees");
        String arr[]=new String [5];
        for(int i=0;i<=arr.length-1;i++)
        {
        	arr[i]=scan.nextLine();
        }
        System.out.println("the names are:");
        for(int i=0;i<=arr.length-1;i++)
        {
        	System.out.print(arr[i] + "  ");
        }
        
	}

}
