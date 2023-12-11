package com.kodnest.strings;
import java.util.Scanner;
public class Stringupplow {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();
		        
		        String swapped = swapCase(input);
		        System.out.println("Swapped case string: " + swapped);
		        
		        scanner.close();
		    }
		    
		    public static String swapCase(String str) {
		        StringBuilder result = new StringBuilder();
		        
		        for (char c : str.toCharArray()) {
		            if (Character.isUpperCase(c)) {
		                result.append(Character.toLowerCase(c));
		            } else if (Character.isLowerCase(c)) {
		                result.append(Character.toUpperCase(c));
		            } else {
		                result.append(c);
		            }
		        }
		        
		        return result.toString();
		    }
}
