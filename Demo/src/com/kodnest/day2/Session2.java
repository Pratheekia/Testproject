package com.kodnest.day2;

public class Session2 {

	public static void main(String[] args) {
		{
			/*int a=0,b=0;
			long k =(long)42.47;
			System.out.println(a);
			
			System.out.println(b+k);
			System.out.println(b++);
			*/
			/*int a,b;
			a=0;
			a= a++ + ++a + a++;  //op is 4
			b=a;
			System.out.println(b);*/
			int a=20;
			byte b=(byte)a;
			a=a+b;
			b=(byte)((b++)+(a*a)+(a/b)+(b%a));
			System.out.println(b);
			
			long l =b;
			byte m=10;
			 b=m;
		}}
		

	}


