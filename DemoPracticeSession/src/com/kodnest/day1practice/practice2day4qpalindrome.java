package com.kodnest.day1practice;

import java.util.Scanner;

public class practice2day4qpalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the num");
		int num = scan.nextInt();
		int temp;
		temp=num;
		 int rev=0;  
		while(num>0)
		{
			rev=rev*10+num%10;  //1. rev=0, 0=0*10+121%10=1, rev=1
		num=num/10;    //1.num=121,  121/10, num=12
		}                //2. rev=1, 1=1*10+12%10 ,rev=10+2=12
		if(temp==rev)     //2. num=12, 12/10, num=1
		{                 //3. rev=12, 12=12*10+1%10, rev=120+1=121 
			System.out.println("it is a palindrome"); 
		}    //here num value is continuosly storing in temp variable
		else
		{
			System.out.println("not a palindrome");
		}
		
		
	}

}
