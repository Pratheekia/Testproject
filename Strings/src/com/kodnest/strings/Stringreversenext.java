package com.kodnest.strings;
import java.util.Scanner;
public class Stringreversenext {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();
		        
		        String reversed = reverseWords(input);
		        System.out.println("String with reversed words: " + reversed);
		        
		        scanner.close();
		    }
		    
		    public static String reverseWords(String str) {
		        String[] words = str.split(" ");
		        StringBuilder reversedString = new StringBuilder();
		        
		        for (int i = words.length - 1; i >= 0; i--) {
		            reversedString.append(words[i]).append(" ");
		        }
		        
		        return reversedString.toString().trim();
		    }
		}


	
