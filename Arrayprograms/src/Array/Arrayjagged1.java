package Array;
import java.util.Scanner;
public class Arrayjagged1 {
//jagged array
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the number of companies");
		int n = scan.nextInt();
		
		
		String[][] arr = new String [n][];
		for(int i=0;i<=arr.length-1;i++)   
		
			{
				System.out.println("Enter the no of employees in the companies " +(i+1) );
				int n1=scan.nextInt();
				arr[i]=new String[n1];
			}
		
		for(int i=0;i<=arr.length-1;i++)   
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the names of companies" +(i+1) + " employee "  + (j+1)+ " is " );
				arr[i][j]=scan.next();				
	}

}
		for(int i=0;i<=arr.length-1;i++)   
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
		System.out.println(" the names of companies" +(i+1) + " employee "  + (j+1)+ " is " +arr[i][j]);

	}
		}}
}
/*
//output. Enter the number of companies
//2
//Enter the no of employees in the companies 1
//3
//Enter the no of employees in the companies 2
//2
//enter the names of companies1 employee 1 is 
//tom
//enter the names of companies1 employee 2 is 
//jerry
//enter the names of companies1 employee 3 is 
//beam
//enter the names of companies2 employee 1 is 
//chutki
//enter the names of companies2 employee 2 is 
//khalia
 //the names of companies1 employee 1 is tom
 //the names of companies1 employee 2 is jerry
 //the names of companies1 employee 3 is beam
 //the names of companies2 employee 1 is chutki
 //the names of companies2 employee 2 is khalia

*/