package com.kodnest.strings;
import java.util.Scanner;
public class Stringuppercase {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();
		        
		        String converted = convertUppercaseToLowercase(input);
		        System.out.println("Converted string: " + converted);
		        
		        scanner.close();
		    }
		    
		    public static String convertUppercaseToLowercase(String str) {
		        char[] charArray = str.toCharArray();
		        
		        for (int i = 0; i < charArray.length; i++) {
		            if (Character.isUpperCase(charArray[i])) {
		                charArray[i] = Character.toLowerCase(charArray[i]);
		            }
		        }
		        
		        return new String(charArray);
		    }
		


	}

}
