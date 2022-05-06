package com.pgsassignments.rec;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		
		int choice;
		double[] conversionRates = {0.010, 0.013, 1.70};
		double inr;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Currency Converter");
		System.out.println("------------------");
		System.out.println("Enter the amount in INR: ");
		inr = scanner.nextInt();
		System.out.println("Enter  your choice:");
		System.out.println("1. INR to GBP");
		System.out.println("2. INR to USD");
		System.out.println("3. INR to Yen");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println(inr + " INR is " +  (inr * conversionRates[0]) + " GBP.");
			break;
			
		case 2:
			System.out.println(inr + " INR is " +  (inr * conversionRates[1]) + " USD.");
			break;
			
		case 3:
			System.out.println(inr + " INR is " +  (inr * conversionRates[2]) + " Yen.");
			break;

		default:
			System.out.println("Enter a valid choice!");
			break;
		}
		

	}

}
