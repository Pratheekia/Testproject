package Array;

import java.util.Scanner;

public class Array14sumofmatyrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the rows and columns of the matrix");
		int [][] arr =new int[scan.nextInt()] [scan.nextInt()];
		System.out.println("enter element to be stored in array");
		for(int i=0; i<=arr.length-1 ; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<=arr.length-1 ; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				sum+=arr[i][j];
			}
			
		}
		System.out.println(sum);
	 	}

	

	

}