package com.kodnest.day2;

public class Session3nestedif {

	public static void main(String[] args) {
		int age=25;
		int weight=48;
		if(age>=18)
		{
			if(weight>50) {
				System.out.println("eligible to donate blood");
			}
			else
			{
				System.out.println(" not eligible to donate blood");
			}
		}
		else {
			System.out.println(" age must be greater than 18");
		}

	}

}
