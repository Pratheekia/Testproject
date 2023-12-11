package com.kodnest.strings;

import java.util.Scanner;

public class Stringcntlettrsinwordsepretly {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println(" enter the string");
        String str=scan.nextLine();
        String [] arr=str.split(" ");
        for(String x:arr)
        {
        	int count=0;
        	char [] arr1=x.toCharArray();
        	for(int i=1;i<=arr1.length;i++)
        	{
        		count++;
        	
        	}
        	 System.out.println("character is " +x+ " is : " + count);
        }
        
        
	}

}
