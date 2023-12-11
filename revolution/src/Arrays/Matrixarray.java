package Arrays;

import java.util.Scanner;

public class Matrixarray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the num of rows");
		  int n1=scan.nextInt(); 
		  System.out.println("Enter the num of column");
		  int n2=scan.nextInt();
		  int [] []  arr= new int [n1][n2];
		  System.out.println("enter the elements to be stored in an array");
		  for(int i=0; i<=arr.length-1; i++)
		{
			  for(int j=0; j<=arr[i].length-1; j++)
			  {
	           System.out.println();
	              arr[i][j]=scan.nextInt();
			  }}
		  for(int i=0; i<=arr.length-1; i++)
			{
				  for(int j=0; j<=arr[i].length-1; j++)
				  {
		           System.out.print( arr[i][j] +" " );
		            
				  }
				  System.out.println(  );
				  }
	              
	
	


	}

}
