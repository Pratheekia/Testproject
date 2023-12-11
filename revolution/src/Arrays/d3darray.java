package Arrays;

import java.util.Scanner;

public class d3darray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the num of cities");
		  int n=scan.nextInt(); 
		  System.out.println("Enter the num of comp in each cities");
		  int n1=scan.nextInt();
		  System.out.println("Enter the num of employees in each comp in city");
		  int n2=scan.nextInt();
		  float [] [][] arr= new float [n][n1][n2];
		  for(int i=0; i<=arr.length-1; i++)
		{
			  for(int j=0; j<=arr[i].length-1; j++)
			  {
				  for(int k=0; k<=arr[i][j].length-1; k++)
				  {
	           System.out.println("Enter the city " + (i+1) + " comp " +(j+1) + " employee " +(k+1) + " salary is");
	              arr[i][j][k]=scan.nextFloat();
			  }}}
		  for(int i=0; i<=arr.length-1; i++)
			{
				  for(int j=0; j<=arr[i].length-1; j++)
				  {
					  for(int k=0; k<=arr[i][j].length-1; k++)
					  {
		           System.out.println("the  city " + (i+1) + " comp " +(j+1) + " emp" +(k+1)+ "salary is " +  arr[i][j][k] );
		            
				  }}}
	              

	}

}
