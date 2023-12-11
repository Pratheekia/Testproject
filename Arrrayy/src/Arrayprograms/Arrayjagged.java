package Arrayprograms;

import java.util.Scanner;

public class Arrayjagged {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of cities ");
		int block=scan.nextInt();
		float [][][] arr=new float[block][][];

        for(int i =0; i<=arr.length-1;i++)
        {
        	System.out.println("enter the number of companies in the city"+ (i+1));
        	int row=scan.nextInt();
        	arr[i]= new float [row][];
        }
        for(int i =0; i<=arr.length-1;i++)
        {
        	for(int j =0; j<=arr.length-1;j++)
        	{
        	System.out.println("enter the number of employes in the city "+ (i+1) + "companyies " + (j+1));
        	int col=scan.nextInt();
        	arr[i][j]= new float [col];
        }
        }
        for(int i =0; i<=arr.length-1;i++)
        {
        	 for(int j =0; j<=arr[i].length-1;j++)
        	 {
        		 for(int k =0; k<=arr[i][j].length-1;k++)
        		 {
        			 System.out.println("Enter the salary of city " +(i+1) +" company " +(j+1) +" of employee " +(k+1) + " is ");
        			 arr[i][j][k]=scan.nextFloat();
        		 }
        	 }
        }
        for(int i =0; i<=arr.length-1;i++)
        {
        	 for(int j =0; j<=arr[i].length-1;j++)
        	 {
        		 for(int k =0; k<=arr[i][j].length-1;k++)
        		 {
        			 System.out.println("Enter the salary of city " + (i+1) +" company " +(j+1) +" of employee " +(k+1) + " is "  +arr[i][j][k]);
        		 }}}		
	}

}


