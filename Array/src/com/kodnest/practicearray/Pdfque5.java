package com.kodnest.practicearray;

import java.util.Scanner;

public class Pdfque5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
	    int[]arr=new int [scan.nextInt()];
	    System.out.println("enter"+ arr.length+ "elements");
	    for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	    System.out.println("array elements are:");
	    for(int x:arr)
	{
		System.out.println(x+" ");
	}
	   
	    for(int i=arr.length-1;  i>=0;i--)
	    {
	    	System.out.println(arr[i]+" ");
	    }
	    System.out.println();

	}

	}


