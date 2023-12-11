package com.kodnest.strings;

import java.util.Scanner;

public class Stringlength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        if(s1.length()==s2.length())
        {
        	System.out.println("Both Strings are same length");
        }
        else
        {
        	System.out.println("Both Strings are not same length");
        }
	}
}
 
