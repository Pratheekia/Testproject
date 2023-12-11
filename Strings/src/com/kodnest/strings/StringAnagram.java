package com.kodnest.strings;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		System.out.println("enter the string");
		String s1="earth";
		Scanner scan=new Scanner(System.in);
		
		
		
		String s2=scan.nextLine();
		System.out.println(s2.contains(s1));
	

	}

}
