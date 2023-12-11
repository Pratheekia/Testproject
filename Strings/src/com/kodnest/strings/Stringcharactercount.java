package com.kodnest.strings;

import java.util.Scanner;

public class Stringcharactercount
{
   public static void main(String[] args)
   {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=scan.nextLine();
	int uppercaseCount=0;
	int lowercaseCount=0;
	int numbersCount=0;
	int charactersCount=0;
	
	StringBuilder upperLetters=new StringBuilder();
	StringBuilder  lowerLetters=new StringBuilder();
	StringBuilder numberList=new StringBuilder();
	StringBuilder specialChars=new StringBuilder();
	
	for(char c: str.toCharArray())
	{
		
	            if (Character.isUpperCase(c)) {
	            	uppercaseCount++;
	                upperLetters.append(c).append(",");
	            } else if (Character.isLowerCase(c)) {
	            	lowercaseCount++;
	                lowerLetters.append(c).append(",");
	            } else if (Character.isDigit(c)) {
	            	numbersCount++;
	                numberList.append(c).append(",");
	            } else {
	            	charactersCount++;
	                specialChars.append(c).append(",");
	            }
	        }

	        System.out.println("Str: " + str);
	        System.out.println("Count of upper case: " + uppercaseCount);
	        if (uppercaseCount > 0) {
	            System.out.println("Upper case letters are " + upperLetters.substring(0, upperLetters.length() - 1));
	        }

	        System.out.println("Count of lower case: " + lowercaseCount);
	        if (lowercaseCount > 0) {
	            System.out.println("Lower case letters are " + lowerLetters.substring(0, lowerLetters.length() - 1));
	        }

	        System.out.println("Count of numbers: " + numbersCount);
	        if (numbersCount > 0) {
	            System.out.println("Numbers are " + numberList.substring(0, numberList.length() - 1));
	        }

	        System.out.println("Count of special characters: " + charactersCount);
	        if (charactersCount > 0) {
	            System.out.println("Special characters are " + specialChars.substring(0, specialChars.length() - 1));
	        }
	    }
	}