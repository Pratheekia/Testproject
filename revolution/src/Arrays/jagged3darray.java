package Arrays;

import java.util.Scanner;

public class jagged3darray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the num of cities");
		  int n=scan.nextInt(); 
		  float [] [] [] arr= new float [n][][];
		  for(int i=0; i<=arr.length-1; i++)
			{
		  System.out.println("Enter the num of companies in cities " + (i+1) );
		  int n1=scan.nextInt();
		  arr[i]=new float [n1][];
			}
		  for(int i=0; i<=arr.length-1; i++)
			{
	      for(int j=0; j<=arr[i].length-1; j++)
	      {
		  System.out.println("Enter the num of employees  in city "+ (i+1) + "in comp" +(j+1) );
		  int n2=scan.nextInt();
		  arr[i][j]=new float [n2];
			}}
		for(int i=0; i<=arr.length-1; i++)
		{
			  for(int j=0; j<=arr[i].length-1; j++)
			  {
				  for(int k=0; k<=arr[i][j].length-1; k++)
				  {
	           System.out.println("Enter the city " + (i+1) + " comp " +(j+1) + " employee " +(k+1) + " salary is" );
	              arr[i][j][k]=scan.nextFloat();
			  }}}
		  for(int i=0; i<=arr.length-1; i++)
			{
				  for(int j=0; j<=arr[i].length-1; j++)
				  {

					  for(int k=0; k<=arr[i][j].length-1; k++)
					  {
				  
		           System.out.println("the  city " + (i+1) + " company " +(j+1) + " employee " +(k+1) + " salary is "  +arr[i][j][k]);
		            
				  }}
			}}   

	}



