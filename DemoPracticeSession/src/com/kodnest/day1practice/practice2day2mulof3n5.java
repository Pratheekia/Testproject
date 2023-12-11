package com.kodnest.day1practice;

import java.util.Scanner;

public class practice2day2mulof3n5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int a = scan.nextInt();
		if(a%15==0)
		{
			System.out.println("the givenn num is numtiple of 3 and 5");
		}
		else
		{
			System.out.println(" the given num is not a mul of 3 and 5");
		}
	}

}
