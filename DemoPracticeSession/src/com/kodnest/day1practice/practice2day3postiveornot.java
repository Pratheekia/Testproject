package com.kodnest.day1practice;

import java.util.Scanner;

public class practice2day3postiveornot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int a = scan.nextInt();
		if(a>0)
		{
			System.out.println(" the given num is postive");
			
		}
		else if(a<0)
		{
			System.out.println("the given num is negetive ");
		}
		else
		{
			System.out.println(" zero");
		}
	}

}
