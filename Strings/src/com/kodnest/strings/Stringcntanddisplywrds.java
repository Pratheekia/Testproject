package com.kodnest.strings;

import java.util.Scanner;

public class Stringcntanddisplywrds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
         System.out.println("enter the sentences");
         String str=scan.nextLine();
         String [] arr=str.split(" ");
         int count=0;
         for(int i=0;i<=arr.length;i++)
         {
        	 count=i;
         }
         System.out.println("Total no of words  " +count);
         int sum=0;
         for(String x:arr)
         {
        	 System.out.println("The word" +(sum+1)+ ":" + x);
        	 sum++;
         }
	}

}
