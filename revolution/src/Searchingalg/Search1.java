package Searchingalg;

import java.util.Scanner;

public class Search1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the num of elements present in an array");
		  int size=scan.nextInt(); 
		  int arr[]=new int [size];
		  System.out.println("Enter the num to be stored in an array");
		  for(int i=0; i<=arr.length-1; i++)
			{
			  arr[i]=scan.nextInt();
			}
		  System.out.println("Enter the key to be searched");
		  int key=scan.nextInt();
		  
		
		  System.out.println(Search2.linear(arr, key));
		  
}

}
