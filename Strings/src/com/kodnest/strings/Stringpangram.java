package com.kodnest.strings;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Stringpangram {

	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();
		        
		        if (isPangram(input)) {
		            System.out.println("The entered string is a pangram.");
		        } else {
		            System.out.println("The entered string is not a pangram.");
		        }
		        
		        scanner.close();
		    }
		    
		    public static boolean isPangram(String str) {
		        Set<Character> letters = new HashSet<>();
		        
		        for (char c : str.toLowerCase().toCharArray()) {
		            if (Character.isLetter(c)) {
		                letters.add(c);
		            }
		        }
		        
		        return letters.size() == 26; // There are 26 letters in the English alphabet

	}

}
