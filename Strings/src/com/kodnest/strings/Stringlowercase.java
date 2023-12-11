package com.kodnest.strings;
import java.util.Scanner;
public class Stringlowercase {


		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();
		        
		        String converted = input.toUpperCase(); // Using the toUpperCase() method
		        System.out.println("Converted string: " + converted);
		        
		        scanner.close();
		    }
		}


	}

}
