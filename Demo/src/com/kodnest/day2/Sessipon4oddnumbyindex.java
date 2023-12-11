package com.kodnest.day2;

import java.util.Scanner;
//odd inrx elements
public class Sessipon4oddnumbyindex {

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
			if(i%2==1)
			
			System.out.println(" the odd num  inex elements are" + arr[i]);
			
		}
	


	


	}

}
