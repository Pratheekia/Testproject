package com.kodnest.day2;

import java.util.Scanner;

public class Sessionrevarr {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the size of an array");
	     int n = scan.nextInt();
	     System.out.println("enter the elements to be stored");
	// wajp print all  the element of an array in reverse order  
	     int [] arr =new int[n];
		for(int i =0; i<=arr.length-1; i++)
		{
		    arr[i]=scan.nextInt();
		    }
		
		for(int i =0; i<=arr.length-1; i++)
		{
			
			
			System.out.println( + arr[i]);
			
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0 )
			{
				System.out.println(arr[i]);
			}
			else
			{
				System.out.println(-1);
			}
		}
	


	}

}





