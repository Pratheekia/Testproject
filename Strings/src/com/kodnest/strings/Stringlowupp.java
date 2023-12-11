package com.kodnest.strings;
import java.util.Scanner;
public class Stringlowupp {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();
		        
		        String inverted = invertCase(input);
		        System.out.println("Inverted case string: " + inverted);
		        
		        scanner.close();
		    }
		    
		    public static String invertCase(String str) {
		        char[] charArray = str.toCharArray();
		        
		        for (int i = 0; i < charArray.length; i++) {
		            char c = charArray[i];
		            if (Character.isUpperCase(c)) {
		                charArray[i] = Character.toLowerCase(c);
		            } else if (Character.isLowerCase(c)) {
		                charArray[i] = Character.toUpperCase(c);
		            }
		        }
		        
		        return new String(charArray);
		    }
		


	}


