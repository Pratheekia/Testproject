package com.kodnest.day2;

import java.util.Scanner;

public class Session3switch1 {

	public static void main(String[] args) {
		System.out.println("Enter a operator");
		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0);
	
		switch (a) {
		
		case '+':
			System.out.println("sum");
			break;
		case '-':
			System.out.println("difference");
			break;
		case '/':
			System.out.println("div");
			break;
		case '*':
			System.out.println("mul");
           break;
		default:
			System.out.println("invalid operator");


		}

	}

}
