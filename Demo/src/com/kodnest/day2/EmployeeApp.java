package com.kodnest.day2;

import java.util.Scanner;

public class EmployeeApp {
public static void main(String[] args) {
		Employee [] p = new Employee[5];
		Scanner scan = new Scanner(System.in);
        for(int i=0;i<=p.length-1;i++)
		  {
			p[i] = new Employee();
			}
		for (int j = 0; j < p.length; j++) {
			System.out.println("Enter Emp " +(j+1) +" name");
            p[j].name = scan.next();
		    System.out.println("Enter Emp " +(j+1) +" age");
			p[j].age = scan.nextInt();
		}
		//displaying
		for (int i = 0; i < p.length; i++) {
	System.out.println("the name of emp  " +p[i].name + " and age of emp  is " +  p[i].age );
		} 
		
	}

}
