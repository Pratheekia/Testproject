package com.kodnest.day2;

import java.util.Scanner;
// finf out even element in odd index
public class Session4oddindexArr {

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
			if(i%2==1 && arr[i]%2==0)
			
			System.out.println(" the even ele in odd index elements are" + arr[i]);
			
		}
	}

}
