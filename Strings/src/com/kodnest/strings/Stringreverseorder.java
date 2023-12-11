package com.kodnest.strings;
import java.util.Scanner;
public class Stringreverseorder {

	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a sentence: ");
		        String input = scanner.nextLine();
		        
		        String reversed = reverseWordsOrder(input);
		        System.out.println("Reversed sentence: " + reversed);
		        
		        scanner.close();
		    }
		    
		    public static String reverseWordsOrder(String sentence) {
		        String[] words = sentence.split(" ");
		        StringBuilder reversedSentence = new StringBuilder();
		        
		        for (int i = words.length - 1; i >= 0; i--) {
		            reversedSentence.append(words[i]).append(" ");
		        }
		        
		        return reversedSentence.toString().trim();
		    }
		}


