package com.pgsassignments.rec;

import java.util.Scanner;

public class NumericCalc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice, a, b;
		
		System.out.println("Numeric Calculator");
		System.out.println("------------------");
		System.out.println("Enter your choice: ");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus Operation");
		
		choice = scanner.nextInt();
		System.out.println("Enter the first integer:");
		a = scanner.nextInt();
		System.out.println("Enter the second integer:");
		b = scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("The sum of " + a + " and " + b +" is: " + (a+b) );
			break;
		case 2:
			System.out.println("The difference of " + a + " and " + b +" is: " + (a-b) );
			break;
		case 3:
			System.out.println("The product of " + a + " and " + b +" is: " + (a*b) );
			break;
		case 4:
			System.out.println("The quotient of " + a + " divided by " + b +" is: " + (a/b) );
			break;
		case 5:
			System.out.println("The remainder when " + a + " is divided by " + b +" is: " + (a%b) );
			break;
		default:
			System.out.println("Please enter a valid choice");
		}

	}

}
