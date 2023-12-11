package Arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the num of companies");
		  int n=scan.nextInt(); 
		  String [] []  arr= new String [n][];
		  for(int i=0; i<=arr.length-1; i++)
			{
		  System.out.println("Enter the num of employees in comp" +(i+1));
		  int n1=scan.nextInt();
		  arr[i]=new String [n1];
			}
		  for(int i=0; i<=arr.length-1; i++)
		{
			  for(int j=0; j<=arr[i].length-1; j++)
			  {
	           System.out.println("Enter the  company " + (i+1) + " employee " +(j+1) + " names is" );
	              arr[i][j]=scan.next();
			  }}
		  for(int i=0; i<=arr.length-1; i++)
			{
				  for(int j=0; j<=arr[i].length-1; j++)
				  {
		           System.out.println("the  company " + (i+1) + " employee " +(j+1) + " names is " +  arr[i][j] );
		            
				  }}
	              

	}

}

