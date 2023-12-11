package com.kodnest.day2;

import java.util.Scanner;
//to find odd number
public class Session4oddnum {

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
		
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==1)
			
			System.out.println(" the odd num elements are" + arr[i]);
			
		}
	}

}


	
