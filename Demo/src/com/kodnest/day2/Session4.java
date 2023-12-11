package com.kodnest.day2;

import java.util.Scanner;

public class Session4 {

	public static void main(String[] args) {

		 
			Scanner scan= new Scanner(System.in);
			System.out.println("enter the size of an array");
		     int n = scan.nextInt();
		     System.out.println("enter the elements to be stored");
		    
		     int [] arr =new int[n];
			for(int i =0; i<=arr.length-1; i++)
			{
			    arr[i]=scan.nextInt();
			    }
			
		//	for(int i =0; i<=arr.length-1; i++)
		//	{
				
				
				//System.out.println( + arr[i]);
			//	
			//}
			for(int i=arr.length-1; i>=0; i--)
			{
				System.out.println( arr[i]);
			}
		}

	

}
