package Array;
import java.util.Scanner;
public class Array10 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("enter the number of companies");
		int n = scan.nextInt();
		System.out.println("enter the number of employess present in  each of the companies");
		int n1 = scan.nextInt();
		
		String[][] arr = new String [n][n1];
		for(int i=0;i<=arr.length-1;i++)   //for 3 companies
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the name of the company" +(i+1) + "employee" + (j+1));
				arr[i][j]=scan.next();
			}
		}
		for(int i=0;i<=arr.length-1;i++)   
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("the name of the company" +(i+1) + " employee "  + (j+1)+ " is " +arr[i][j]);
				
	}

}
	

	}

}
