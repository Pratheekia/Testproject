package com.kodnest.practicearray;
import java.util.Scanner;
public class Pdfque6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int [] arr = new int [scan.nextInt()];
		System.out.println("Enter " + arr.length + " elements");
		for(int i=0; i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		 System.out.println("Array elements are");
		for(int x : arr)
		{
			if(x<0)
			System.out.println(0 + " ");
			else
			{System.out.println(x);
		}

	}
	}
}
