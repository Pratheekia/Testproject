package com.kodnest.day2;

import java.util.Scanner;

public class Session3switch2 {

		  public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose an operator: +, -, *, or /");
		    char operator = scan.next().charAt(0);
            System.out.println("Enter first number");
		   double number1 = scan.nextDouble();
		    System.out.println("Enter second number");
		    double number2 = scan.nextDouble();
		    double result;
            switch (operator) {
                case '+':
		        result = number1 + number2;
		        System.out.println(number1 + " + " + number2 + " = " + result);
		        break;
		        case '-':
		        result = number1 - number2;
		        System.out.println(number1 + " - " + number2 + " = " + result);
		        break;
		        case '*':
		        result = number1 * number2;
		        System.out.println(number1 + " * " + number2 + " = " + result);
		        break;
                case '/':
		        result = number1 / number2;
		        System.out.println(number1 + " / " + number2 + " = " + result);
		        break;
		        default:
		        System.out.println("Invalid operator!");
		        break;
		    
		}

		}

	}


