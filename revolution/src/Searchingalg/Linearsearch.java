package Searchingalg;

import java.util.Scanner;

public class Linearsearch {

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
		   for(int i=0; i<=arr.length-1;i++)
		   {
			   if(key==arr[i]) //arr[i]=10 20 30 40 50, i=0,1,2,3,4
			   {
				   System.out.println("Key found at index " +i); //if loop
				   System.exit(0); //manually terminate the prog bt nt a good approach
			   } //exit will solve the prob of,if 30 is to find of 10 t0 50 it will show op as
		   }//key is found at index 2 and also key not found.now we have to 
		   //find alternative way other than exit func, that is instead of exit func put return()
		   
			   System.out.println("Key not found");
		   
	}

}
