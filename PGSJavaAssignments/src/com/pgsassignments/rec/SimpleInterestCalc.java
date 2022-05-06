package com.pgsassignments.rec;

import java.util.Scanner;

public class SimpleInterestCalc {
	
	public static void main(String[] args) {
		int principal, numberOfYears, interestRate;
		float interestAmount;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the principal: ");
		principal = scanner.nextInt();
		System.out.println("");
		
		System.out.print("Enter the interest rate in %: ");
		interestRate = scanner.nextInt();
		System.out.println("");
		
		System.out.print("Enter the number of years: ");
		numberOfYears = scanner.nextInt();
		System.out.println("");
		
		interestAmount = (principal * numberOfYears * interestRate)/100;
		System.out.print("The simple interest is: " + interestAmount);
		
	}

}
