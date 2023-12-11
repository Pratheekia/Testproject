package com.kodnest.day2;

import java.util.Scanner;

public class session3elseifladder {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a num");
        int a=scan.nextInt();
        if(a>0)
        {
        	System.out.println(" num is positive");
        }
        else if(a<0)
        {
        	System.out.println(" num is negative");
        
	}
        else {
        	System.out.println("num is 0");
        }

	}

}
