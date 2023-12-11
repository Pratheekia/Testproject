package com.kodnest.day1practice;

import java.util.Scanner;

public class practice2day1divby2345 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a num");
		int n = scan.nextInt();
		if(n%60==0)
		{
			System.out.println("divisible by 2,3,4,5");
			
		}
		else
		{
			System.out.println(" not divisible");
		}
		
		

	}

}
