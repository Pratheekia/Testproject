package com.kodnest.strings;
import java.util.Scanner;

public class Stringpalindrome {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        if (isPalindrome(input)) {
	            System.out.println("The entered string is a palindrome.");
	        } else {
	            System.out.println("The entered string is not a palindrome.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static boolean isPalindrome(String str) {
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }
	}


	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        if (isPalindrome(input)) {
	            System.out.println("The entered string is a palindrome.");
	        } else {
	            System.out.println("The entered string is not a palindrome.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static boolean isPalindrome(String str) {
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }
	}

}
