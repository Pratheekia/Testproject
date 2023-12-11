package com.kodnest.strings;

import java.util.Scanner;

public class StringCountletters {

	public static void main(String[] args) {
		Scanner  scan=new Scanner(System.in);
        System.out.println("Enter  a string");
		String str=scan.nextLine();
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			count=i;
		}
		System.out.println(count);
	}

} //calculating with index 0 i.e 0 to 16=17 with spaces 
