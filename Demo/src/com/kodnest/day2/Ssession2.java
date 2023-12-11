package com.kodnest.day2;

import java.util.Scanner;

public class Ssession2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		check(num);
	
	}
	private static void check(int num) {
		if((num%4)==0)
		{
			System.out.println(" diviosinle");
		}
		else {
			System.out.println("not divisible");
		}
		
	}
	}


