package com.kodnest.day1practice;

import java.util.Scanner;

public class Araraypractice {

	public static void main(String[] args) {
		double [] arr= new double[7];
		Scanner scan = new Scanner (System.in);
        for( int i=0; i<=arr.length-1; i++)
        {
        	
        		System.out.println(" enter the percentages of student" + (i+1));
        		arr[i]=scan.nextInt();
        	}
        for( int i=0; i<=arr.length-1; i++)
        {
        	
        		System.out.println(" the percentages of students are" + arr[i]);
        
        }
        
	}

}
